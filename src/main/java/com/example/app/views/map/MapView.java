package com.example.app.views.map;

import com.vaadin.flow.component.template.Id;
import com.example.app.components.leafletmap.LeafletMap;
import com.vaadin.flow.component.HasSize;
import com.vaadin.flow.component.littemplate.LitTemplate;
import com.vaadin.flow.router.Route;
import com.vaadin.flow.router.PageTitle;
import com.example.app.views.MainLayout;
import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;

@PageTitle("Map")
@Route(value = "map", layout = MainLayout.class)
@Tag("map-view")
@JsModule("./views/map/map-view.ts")
public class MapView extends LitTemplate implements HasSize {

    @Id("theMap")
    private LeafletMap map;

    public MapView() {
        setSizeFull();
        map.setView(55.0, 10.0, 4);
    }
}
