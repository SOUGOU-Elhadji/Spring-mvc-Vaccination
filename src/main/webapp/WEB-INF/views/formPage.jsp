<%@ include file="../common/header.jspf" %>
<%@ include file="../common/navigation.jspf" %>

	<br>
	<div class="container col-md-5">
		<div class="card shadow p-3 mb-5 bg-body rounded">
			<div class="card-body">
				
				<form action="/add-patient" method="post">
		
				<c:if test="${patient != null}">
					<input type="hidden" name="id" value="<c:out value='${patient.id}' />" />
				</c:if>
			
				<fieldset class="form-group">
					<!--label>User</label--> <input type="hidden"
						value="<c:out value='${patient.user }' />" class="form-control"
						name="user" required="required">
				</fieldset>

				<fieldset class="form-group">
					<label>First Name</label> <input type="text"
						value="<c:out value='${patient.firstName }' />" class="form-control"
						name="firstName">
				</fieldset>
				<fieldset class="form-group">
					<label>Last Name</label> <input type="text"
						value="<c:out value='${patient.lastName }' />" class="form-control"
						name="lastName">
				</fieldset>
				<fieldset class="form-group">
					<label>Address</label> <input type="text"
						value="<c:out value='${patient.address }' />" class="form-control"
						name="address">
				</fieldset>
				<fieldset class="form-group">
					<label>Number</label> <input type="text"
						value="<c:out value='${patient.number }' />" class="form-control"
						name="number">
				</fieldset>
				<fieldset class="form-group">
					<label>Vaccine Type</label>
						<select type="text" value="<c:out value='${patient.vaccineType }' />" name="vaccineType" class="form-control form-select-sm" aria-label=".form-select-sm example">
						  <option selected></option>
						  <option value="1">Astrazenecca</option>
						  <option value="2">Fizer</option>
						  <option value="3">Johnson & Johnson</option>
						</select>
				</fieldset>
				<fieldset class="form-group">
					<label>Number of Dose</label> 
						<select type="number" value="<c:out value='${patient.numberDose }' />" name="numberDose" class="form-control form-select-sm" aria-label=".form-select-sm example">
						  <option selected></option>
						  <option value="1">1</option>
						  <option value="2">2</option>
						</select>
				</fieldset>

			
				<button type="submit" class="btn btn-success">Save</button>
				</form>
			</div>
		</div>
	</div>
<%@ include file="../common/footer.jspf" %>	
