<%@ page language="java" contentType="text/html; UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<link rel="stylesheet"
	href="<%=request.getContextPath()%>/bootstrap-4.1.1-dist/css/bootstrap.css">
</head>
<body>
	<div class="container-fluid">
		<h4>SGP - App</h4>
		<!-- <h1><%=response.getStatus()%></h1> -->
	</div>

	<div class="container">
		<form method="post" id="formCollab" class="needs-validation" novalidate>
			<div class="form-group row">
				<label for="inputNom" class="col-form-label col-4">Nom</label>
				<div class="col-8 pr-0">
					<input type="text" id="inputNom" name="nom" class="form-control <%=request.getAttribute("nom")%>" required>
					<div class="invalid-feedback">Le nom est obligatoire.</div>
				</div>
			</div>

			<div class="form-group row">
				<label for="inputPrenom" class="col-form-label col-4">Prénom</label>
				<div class="col-8 pr-0">
					<input type="text" id="inputPrenom" name="prenom" class="form-control <%=request.getAttribute("prenom")%>" required>
					<div class="invalid-feedback">Le prénom est obligatoire.</div>
				</div>
			</div>

			<div class="form-group row">
				<label for="inputDate" class="col-form-label col-4">Date de
					naissance</label>
				<div class="col-8 pr-0">
					<input type="text" id="inputDate" name="dateNaissance" class="form-control <%=request.getAttribute("dateNaissance")%>" required>
					<div class="invalid-feedback">La date de naissance est
						obligatoire.</div>
				</div>
			</div>

			<div class="form-group row">
				<label for="textAdresse" class="col-form-label col-4">Adresse</label>
				<div class="col-8 pr-0">
					<textarea type="text" id="textAdresse" name="adresse" class="form-control <%=request.getAttribute("adresse")%>"
						required></textarea>
					<div class="invalid-feedback">L'adresse est obligatoire.</div>
				</div>
			</div>

			<div class="form-group row">
				<label for="inputNoSecu" class="col-form-label col-4">Numéro
					de sécurité sociale</label>
				<div class="col-8 pr-0">
					<input type="text" id="inputNoSecu" name="noSecu" class="form-control <%=request.getAttribute("noSecu")%>" required>
					<div class="invalid-feedback">Le numéro de sécurité sociale
						est obligatoire.</div>
				</div>
			</div>

			<div class="row">
				<div class="ml-auto">
					<button type="button" id="buttonCreer"
						class="btn btn-sm btn-success" data-toggle="modal"
						data-target="#modelId">Créer</button>
				</div>
			</div>

			<!-- Modal -->
			<div class="modal fade" id="modelId" tabindex="-1" role="dialog"
				aria-labelledby="modelTitleId" aria-hidden="true">
				<div class="modal-dialog" role="document">
					<div class="modal-content">
						<div class="modal-header">
							<h4 class="modal-title" id="modelTitleId">Création d'un
								collaborateur</h4>
						</div>
						<div class="modal-body">
							Vous êtes sur le point de créer un nouveau collaborateur : <br>
							<div class="row">
								<span class="col-8">Nom: </span> <span id="modalNom"
									class="col-4"></span>
							</div>

							<div class="row">
								<span class="col-8">Prénom: </span> <span id="modalPrenom"
									class="col-4"></span>
							</div>

							<div class="row">
								<span class="col-8">Date de naissance: </span> <span
									id="modalDate" class="col-4"></span>
							</div>

							<div class="row">
								<span class="col-8">Adresse: </span> <span id="modalAdresse"
									class="col-4"></span>
							</div>

							<div class="row">
								<span class="col-8">Numéro de sécurité sociale: </span> <span
									id="modalNoSecu" class="col-4"></span>
							</div>
						</div>
						<div class="modal-footer">
							<input type="submit" value="Confirmer" class="btn btn-primary">
							<button type="button" class="btn btn-secondary"
								data-dismiss="modal">Annuler</button>
						</div>
					</div>
				</div>
			</div>
		</form>

		<script
			src="<%=request.getContextPath()%>/bootstrap-4.1.1-dist/js/jquery-3.3.1.min.js"></script>
		<script
			src="<%=request.getContextPath()%>/bootstrap-4.1.1-dist/js/bootstrap.bundle.min.js"></script>

		<script>
			$(".invalid").each(function(){
				$(this).css("border-color", "#DC3545");
				$(".invalid + .invalid-feedback").css("display", "block");
			});
		</script>
	</body>
</html>