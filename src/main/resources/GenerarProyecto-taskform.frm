{"id":"2f47ad19-d6ea-4f7a-b74d-971193ccde59","name":"GenerarProyecto-taskform.frm","model":{"taskName":"GenerarProyecto","processId":"Supervision_linea.Monitoreo_Insitu","properties":[{"name":"Administrado","typeInfo":{"type":"BASE","className":"java.lang.String","multiple":false},"metaData":{"entries":[{"name":"field-readOnly","value":true}]}},{"name":"monitoreo_out","typeInfo":{"type":"OBJECT","className":"java.lang.Object","multiple":false},"metaData":{"entries":[{"name":"field-type","value":"TextArea"}]}}],"formModelType":"org.kie.workbench.common.forms.jbpm.model.authoring.task.TaskFormModel"},"fields":[{"maxLength":100,"placeHolder":"Administrado","id":"field_624378757934025E11","name":"Administrado","label":"Administrado","required":false,"readOnly":true,"validateOnChange":true,"binding":"Administrado","standaloneClassName":"java.lang.String","code":"TextBox","serializedFieldClassName":"org.kie.workbench.common.forms.fields.shared.fieldTypes.basic.textBox.definition.TextBoxFieldDefinition"},{"placeHolder":"Monitoreo_out","rows":4,"id":"field_2684501571930862E12","name":"monitoreo_out","label":"Monitoreo_out","required":false,"readOnly":false,"validateOnChange":true,"binding":"monitoreo_out","standaloneClassName":"java.lang.Object","code":"TextArea","serializedFieldClassName":"org.kie.workbench.common.forms.fields.shared.fieldTypes.basic.textArea.definition.TextAreaFieldDefinition"}],"layoutTemplate":{"version":3,"style":"FLUID","layoutProperties":{},"rows":[{"properties":{},"layoutColumns":[{"span":"12","height":"12","properties":{},"rows":[],"layoutComponents":[{"dragTypeName":"org.uberfire.ext.plugin.client.perspective.editor.layout.editor.HTMLLayoutDragComponent","properties":{"HTML_CODE":"\u003ch3\u003eInputs:\u003c/h3\u003e"},"parts":[]}]}]},{"properties":{},"layoutColumns":[{"span":"12","height":"12","properties":{},"rows":[],"layoutComponents":[{"dragTypeName":"org.kie.workbench.common.forms.editor.client.editor.rendering.EditorFieldLayoutComponent","properties":{"field_id":"field_624378757934025E11","form_id":"2f47ad19-d6ea-4f7a-b74d-971193ccde59"},"parts":[]}]}]},{"properties":{},"layoutColumns":[{"span":"12","height":"12","properties":{},"rows":[],"layoutComponents":[{"dragTypeName":"org.uberfire.ext.plugin.client.perspective.editor.layout.editor.HTMLLayoutDragComponent","properties":{"HTML_CODE":"\u003ch3\u003eOutputs:\u003c/h3\u003e"},"parts":[]}]}]},{"properties":{},"layoutColumns":[{"span":"12","height":"12","properties":{},"rows":[],"layoutComponents":[{"dragTypeName":"org.kie.workbench.common.forms.editor.client.editor.rendering.EditorFieldLayoutComponent","properties":{"field_id":"field_2684501571930862E12","form_id":"2f47ad19-d6ea-4f7a-b74d-971193ccde59"},"parts":[]}]}]}]}}