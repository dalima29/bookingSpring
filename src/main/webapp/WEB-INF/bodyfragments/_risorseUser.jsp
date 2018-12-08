<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<head>
<title>Risorse</title>
</head>
<body>

	<div id="page-wrapper">
		<div class="row">
			<div class="col-lg-12">
				<h1 class="page-header">Risorse</h1>
			</div>
			<!-- /.col-lg-12 -->
		</div>
		<!-- /.row -->
		<div class="row">
			<div class="col-lg-12">
				<div class="panel panel-default">
					<div class="panel-heading">Risorse</div>
					<!-- /.panel-heading -->
					<div class="panel-body">
						<table width="100%"
							class="table table-striped table-bordered table-hover"
							id="dataTables-example">
							<thead>
								<tr>
									<th>Id</th>
									<th>Limite</th>
									<th>Nome</th>
									<th>Risorsa</th>
								</tr>
							</thead>
						</table>
						<!-- /.table-responsive -->
					</div>
					<!-- /.panel-body -->
				</div>
				<!-- /.panel -->
			</div>
			<!-- /.col-lg-12 -->
		</div>
		<!-- /.row -->
	</div>

	<script>
		$(document).ready(function() {
			$('#dataTables-example').DataTable({
				"ajax" : "/user/getrisorselistuser",
				"columns" : [ {
					"data" : "id"
				}, {
					"data" : "limite"
				}, {
					"data" : "nome"
				}, {
					"data" : "tipo"
				} ]

			});

		});
	</script>
</body>