package com.moloth.admin.controller;

import org.junit.Assert;
import org.junit.Test;
import org.springframework.ui.ExtendedModelMap;
import org.springframework.ui.Model;

import static org.hamcrest.core.Is.is;

public class SimpleFormControllerTest {

    @Test
    public void AsserProperLandingPage() {
        SimpleFormController simpleFormController = new SimpleFormController();
        Model model = new ExtendedModelMap();

        String expectedStartPageName = "startPage";
        String expectedName = "My Name";
        String expectedHiddenParameter = "My Hidden Attribute";

        String actualStartPageName = simpleFormController.mirrorGet(expectedName, expectedHiddenParameter, model);
        String actualName = (String) model.asMap().get("name");
        String actualHiddenParameter = (String) model.asMap().get("hiddenParameter");

        Assert.assertThat(actualStartPageName, is(expectedStartPageName));
        Assert.assertThat(actualName, is(expectedName));
        Assert.assertThat(actualHiddenParameter, is(expectedHiddenParameter));
    }
}
