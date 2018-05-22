<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<div class="container-fluid">
		<h4>Nouveau Collaborateur</h4>
	</div>

	<div class="container">
		<form id="formCollab" class="needs-validation" novalidate>
			<div class="form-group row">
				<label for="inputNom" class="col-form-label col-4">Nom</label>
				<div class="col-8 pr-0">
					<input type="text" id="inputNom" class="form-control" required>
					<div class="invalid-feedback">Le nom est obligatoire.</div>
				</div>
			</div>

			<div class="form-group row">
				<label for="inputPrenom" class="col-form-label col-4">Pr�nom</label>
				<div class="col-8 pr-0">
					<input type="text" id="inputPrenom" class="form-control" required>
					<div class="invalid-feedback">Le pr�nom est obligatoire.</div>
				</div>
			</div>

			<div class="form-group row">
				<label for="inputDate" class="col-form-label col-4">Date de
					naissance</label>
				<div class="col-8 pr-0">
					<input type="text" id="inputDate" class="form-control" required>
					<div class="invalid-feedback">La date de naissance est
						obligatoire.</div>
				</div>
			</div>

			<div class="form-group row">
				<label for="textAdresse" class="col-form-label col-4">Adresse</label>
				<div class="col-8 pr-0">
					<textarea type="text" id="textAdresse" class="form-control"
						required></textarea>
					<div class="invalid-feedback">L'adresse est obligatoire.</div>
				</div>
			</div>

			<div class="form-group row">
				<label for="inputNoSecu" class="col-form-label col-4">Num�ro
					de s�curit� sociale</label>
				<div class="col-8 pr-0">
					<input type="text" id="inputNoSecu" class="form-control" required>
					<div class="invalid-feedback">Le num�ro de s�curit� sociale
						est obligatoire.</div>
				</div>
			</div>

			<div class="row">
				<div class="ml-auto">
					<button type="button" id="buttonCreer"
						class="btn btn-sm btn-success" data-toggle="modal"
						data-target="#modelId">Cr�er</button>
				</div>
			</div>

			<!-- Modal -->
			<div class="modal fade" id="modelId" tabindex="-1" role="dialog"
				aria-labelledby="modelTitleId" aria-hidden="true">
				<div class="modal-dialog" role="document">
					<div class="modal-content">
						<div class="modal-header">
							<h4 class="modal-title" id="modelTitleId">Cr�ation d'un
								collaborateur</h4>
						</div>
						<div class="modal-body">
							Vous �tes sur le point de cr�er un nouveau collaborateur : <br>
							<div class="row">
								<span class="col-8">Nom: </span> <span id="modalNom"
									class="col-4"></span>
							</div>

							<div class="row">
								<span class="col-8">Pr�nom: </span> <span id="modalPrenom"
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
								<span class="col-8">Num�ro de s�curit� sociale: </span> <span
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
</body>
</html>