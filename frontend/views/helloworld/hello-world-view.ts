import { html, LitElement, customElement } from 'lit-element';


import '@vaadin/vaadin-button';
import '@vaadin/vaadin-text-field';
import '@vaadin/vaadin-ordered-layout/vaadin-vertical-layout.js';

@customElement('hello-world-view')
export class HelloWorldView extends LitElement {
  createRenderRoot() {
    // Do not use a shadow root
    return this;
  }

  render() {
    return html` <vaadin-vertical-layout  id="mainLayout">
    <vaadin-text-field id="name" label="Your name"></vaadin-text-field>
      <vaadin-button id="sayHello">Say hello</vaadin-button>
      </vaadin-vertical-layout>
      `;
  }
}
