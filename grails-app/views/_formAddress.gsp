<fieldset class="embedded"><legend><g:message code="organisation.address.label" default="Address" /></legend>

<g:hiddenField name="${prefix}.id" value="${addressInstance?.id}" />
<g:hiddenField name="${prefix}.version" value="${addressInstance?.version}" />


<div class="fieldcontain ${hasErrors(bean: address, field: '${prefix}.street', 'error')}">
	<label for="${prefix}.street">
		<g:message code="${prefix}.street.label" default="Street" />
	</label>
	<g:textField name="${prefix}.street" name="${prefix}Street"  required="" value="${addressInstance?.street}"/>
</div>

<div class="fieldcontain ${hasErrors(bean: addressInstance, field: 'zipCode', 'error')} ">
	<label for="${prefix}.zipCode">
		<g:message code="organisation.${prefix}.zipCode.label" default="Zip Code" />
		
	</label>
	<g:textField name="${prefix}.zipCode" id="${prefix}ZipCode"  maxlength="15" value="${addressInstance?.zipCode}"/>
</div>
				
<div class="fieldcontain ${hasErrors(bean: addressInstance, field: 'address.city', 'error')}">
	<label for="${prefix}.city">
		<g:message code="${prefix}.city.label" default="City" />
	</label>
	<g:textField name="${prefix}.city" id="${prefix}City"  required="" value="${addressInstance?.city}"/>
</div>

<div class="fieldcontain ${hasErrors(bean: addressInstance, field: 'country', 'error')} required">
	<label for="${prefix}.country">
		<g:message code="${prefix}.country.label" default="Country" />
		<span class="required-indicator">*</span>
	</label>	
	<g:if test="${countryList}">
		<g:select class="countrySelector" name="${prefix}.country"  id="${prefix}Country" value="${addressInstance?.country}"
		    noSelection="${['null':'-- select country --']}"
		    from='${countryList}' optionKey="code" optionValue="sname" ></g:select>
	</g:if>
	<g:else>
		<g:textField name="${prefix}.country" id="${prefix}Country" required="" value="${addressInstance?.country}"/>
	</g:else>
</div>
	
<%-- /**<div class="fieldcontain ${hasErrors(bean: organisationInstance, field: '${prefix}.id', 'error')} required">
	<label for="address.id">
		<g:message code="organisation.address.id.label" default="Id" />
		<span class="required-indicator">*</span>
	</label>
	<g:field type="number" name="id" required="" value="${fieldValue(bean: addressInstance, field: 'id')}"/>
</div> **/ --%>

<%-- /**<div class="fieldcontain ${hasErrors(bean: addressInstance, field: 'version', 'error')} required">
	<label for="address.version">
		<g:message code="${prefix}.version.label" default="Version" />
		<span class="required-indicator">*</span>
	</label>
	<g:field type="number" name="version" required="" value="${fieldValue(bean: addressInstance, field: 'version')}"/>
</div>**/ --%>


</fieldset>