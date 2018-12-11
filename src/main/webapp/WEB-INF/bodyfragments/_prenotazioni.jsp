<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<head>
<title>prenotazioni</title>
</head>
<body>
	<div id="page-wrapper">
		<div class="row">
			<div class="col-lg-12">
				<h1 class="page-header">Prenotazioni</h1>
			</div>
			<!-- /.col-lg-12 -->
		</div>
		<!-- /.row -->
		<div class="row">
			<div class="col-lg-12">
				<div class="panel panel-default">
					<div class="panel-heading">Prenotazioni</div>
					<!-- /.panel-heading -->
					<div class="panel-body">
						<table width="100%"
							class="table table-striped table-bordered table-hover"
							id="dataTables-example">
							<thead>
								<tr>
									<th style="text-align : center">Id</th>
									<th style="text-align : center">Nome risorsa</th>
									<th style="text-align : center">Nome</th>
									<th style="text-align : center">Inizio</th>
									<th style="text-align : center">Fine</th>
									<th style="text-align : center">Nome utente</th>
								</tr>
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

	<!-- Page-Level Demo Scripts - Tables - Use for reference -->
	<script>
		$(document).ready(function() {
			$('#dataTables-example').DataTable({
				"ajax" : "/admin/getprenotazionilist",

				"columns" : [ {
					className: "right",
					"data" : "id"
				}, {
					"data" : "risorsa"
				}, {
					"data" : "nomeP"
				}, {
					"data" : "inizio",
					"render": function ( data, type, row ) {
						var x= new Date(data);
						return new Date(x.getTime() - (x.getTimezoneOffset() * 60000)).toJSON();
		                }
				}, {
					"data" : "fine",
					"render": function ( data, type, row ) {
						var x= new Date(data);
						return new Date(x.getTime() - (x.getTimezoneOffset() * 60000)).toJSON();
		                }
				}, {
					"data" : "appUser"
				} ]

			});

		});
	</script>
		<style>
.left {
	text-align: left;
}

.right {
	text-align: right;
}

.center {
	text-align: center;
}
</style>
</body>