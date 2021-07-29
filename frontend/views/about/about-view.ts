import { html, LitElement, customElement } from 'lit-element';



@customElement('about-view')
export class AboutView extends LitElement {
  createRenderRoot() {
    // Do not use a shadow root
    return this;
  }
  render() {
    return html`<div>Content placeholder</div>`;
  }
}
