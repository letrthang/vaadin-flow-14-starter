import { html, LitElement, customElement } from 'lit-element';


import '../../components/leafletmap/leaflet-map';

@customElement('map-view')
export class MapView extends LitElement {
  createRenderRoot() {
    return this;
  }

  render() {
    return html`<leaflet-map class="map" id="theMap"><span></span></leaflet-map>`;
  }
}
