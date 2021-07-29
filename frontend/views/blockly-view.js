import { LitElement, css, html } from 'lit-element';
import { xml } from 'lit-xml';
import '@webcomponents/webcomponentsjs/webcomponents-loader.js';
import '@vaadin/vaadin-button/vaadin-button.js';
import '@vaadin/vaadin-text-field/vaadin-text-field.js';
import * as Blockly from 'blockly';

class BlocklyView extends LitElement {
  	static get properties() {
	    return {
	      textNameValue: { type: String },
	      textClientToken: { type: String },
	      initialXml: { type: String }
	    }
	  }
  
 	constructor() {
	  	super();
	  	this.textNameValue = "task 1";
	  	this.textClientToken = "";
	}	
	
    render() {
        return html`
        <style>
		 	.textHello{
		 		display: flex;
		 		width: 250px;
		 	}
		 	.butHello{
		 		display: flex;
		 		width: 50px;
		 	}
		 </style>
		 
        <vaadin-text-field id="textName" label="Input Name" value="${this.textNameValue}" ></vaadin-text-field>
      	<vaadin-button id="butHello" theme="primary" class="butHello" @click="${this.createBlockly}" >Hello</vaadin-button>
		<div id="blocklyDiv"></div>
    `;
    }
    
    createBlockly(){
    	let blocklyDiv = this.shadowRoot.querySelector("blocklyDiv");
    	const xmlFragment = xml`<xml id="toolbox" style="display: none">
			<category name="Logic" colour="210">
				<block type="controls_if"></block>
				<block type="logic_compare"></block>
				<block type="math_number">
					<field name="NUM">30</field>
				</block>
				<block type="logic_boolean"></block>
			</category>
			<category name="Variables" colour="330" custom="VARIABLE"></category>
		</xml>`
    	
    	const workspace = Blockly.inject(blocklyDiv,
        {
            toolbox: xmlFragment,
            media: 'https://unpkg.com/blockly/media/'
        });
    }
}

customElements.define('blockly-view', BlocklyView);