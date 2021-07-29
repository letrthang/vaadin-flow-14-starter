package com.example.app.views.about;

import com.vaadin.flow.component.littemplate.LitTemplate;
import com.vaadin.flow.router.Route;
import com.vaadin.flow.router.PageTitle;
import com.example.app.views.MainLayout;
import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;

@PageTitle("About")
@Route(value = "about", layout = MainLayout.class)
@Tag("about-view")
@JsModule("./views/about/about-view.ts")
public class AboutView extends LitTemplate {

    // This is the Java companion file of a design
    // You can find the design file inside /frontend/views/

    public AboutView() {
    }
}
