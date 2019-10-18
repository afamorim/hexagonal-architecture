package com.cjcalmeida.hexagonal.architecture.domain;

import com.tngtech.archunit.junit.AnalyzeClasses;
import com.tngtech.archunit.junit.ArchTest;
import com.tngtech.archunit.junit.ArchUnitRunner;
import com.tngtech.archunit.lang.ArchRule;
import com.tngtech.archunit.lang.CompositeArchRule;
import com.tngtech.archunit.library.GeneralCodingRules;
import org.junit.runner.RunWith;

@RunWith(ArchUnitRunner.class)
@AnalyzeClasses(packages = "com.cjcalmeida.hexagonal.architecture.domain")
public class DomainArchitectureTest {

    @ArchTest
    public static final ArchRule no_classes_should_access_standard_streams_or_throw_generic_exceptions =
            CompositeArchRule.of(GeneralCodingRules.NO_CLASSES_SHOULD_ACCESS_STANDARD_STREAMS)
                    .and(GeneralCodingRules.NO_CLASSES_SHOULD_THROW_GENERIC_EXCEPTIONS);
}
