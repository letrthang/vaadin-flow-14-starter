package com.example.app.views.helloworld;

import com.vaadin.flow.component.littemplate.LitTemplate;
import com.vaadin.flow.component.notification.Notification;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.template.Id;
import com.vaadin.flow.component.textfield.TextField;
import com.vaadin.flow.router.Route;
import com.vaadin.flow.router.PageTitle;

import java.util.ArrayList;
import java.util.Base64;
import java.util.List;

import com.example.app.views.MainLayout;
import com.vaadin.flow.router.RouteAlias;
import com.vaadin.componentfactory.EnhancedRichTextEditor;
import com.vaadin.componentfactory.TabStop;
import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;

/**
 * A Designer generated component for the stub-tag template.
 *
 * Designer will add and remove fields with @Id mappings but does not overwrite
 * or otherwise change this file.
 */
@PageTitle("Hello World")
@Route(value = "hello", layout = MainLayout.class)
@RouteAlias(value = "", layout = MainLayout.class)
@Tag("hello-world-view")
@JsModule("./views/helloworld/hello-world-view.ts")
public class HelloWorldView extends LitTemplate {

    EnhancedRichTextEditor rte = new EnhancedRichTextEditor();

    @Id("mainLayout")
    private VerticalLayout mainLayout;


    @Id
    private TextField name;

    @Id
    private Button sayHello;

    public HelloWorldView() {

        mainLayout.add(rte);

        sayHello.addClickListener(e -> {
            Notification.show("Hello " + name.getValue());
             
            // to test rich text editor
             List<TabStop> tabStops = new ArrayList<>();

             tabStops.add(new TabStop(TabStop.Direction.LEFT, 150));
             tabStops.add(new TabStop(TabStop.Direction.RIGHT, 350));
             tabStops.add(new TabStop(TabStop.Direction.MIDDLE, 550));
 
             rte.setTabStops(tabStops);
             System.out.println(new String(Base64.getDecoder().decode("W3siaW5zZXJ0IjoiaGVsbG9cbiJ9XQ==")));
             rte.setValue(new String(Base64.getDecoder().decode("W3siaW5zZXJ0IjoiaGVsbG9cbiJ9XQ==")));
             
        });
    }
}
