package com.lab.journe.cucumber.stepdefs;

import com.lab.journe.JourneApp;

import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.ResultActions;

import org.springframework.boot.test.context.SpringBootTest;

@WebAppConfiguration
@SpringBootTest
@ContextConfiguration(classes = JourneApp.class)
public abstract class StepDefs {

    protected ResultActions actions;

}
