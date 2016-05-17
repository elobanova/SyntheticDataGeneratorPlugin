package com.elobanova.mbdg.model.test;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

import com.elobanova.mbdg.model.test.setup.AllSetupTests;
import com.elobanova.mbdg.model.test.xml.AllXMLTests;

@RunWith(Suite.class)
@SuiteClasses({ AllSetupTests.class, AllXMLTests.class })
public class AllTests {

}
