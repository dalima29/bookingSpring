<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<head>
<title>Risorse-Amministratore</title>
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
						<div>
						<h3><font color="red"><b>${erroreNome}</b></font></h3>
						
							 <span><a
								href="${pageContext.request.contextPath}/admin/aggiungi-risorsa"><button
										type="button" class="btn btn-default btn-circle">
										<i class="fa fa-plus"></i>
									</button></a></span> <span>Aggiungi risorsa</span>
						</div>

						<table width="100%"
							class="table table-striped table-bordered table-hover"
							id="dataTables-example">
							<thead>
								<tr>
									<th style="text-align : center">Id</th>
									<th style="text-align : center">Limite</th>
									<th style="text-align : center">Nome</th>
									<th style="text-align : center">Risorsa</th>
									<th></th>
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
		$(document)
				.ready(
						function() {
							$('#dataTables-example')
									.DataTable(
											{
												"ajax" : "/admin/getrisorselist",
										        "language": {
										            "url": "//cdn.datatables.net/plug-ins/1.10.19/i18n/Italian.json"
										        },
												"columns" : [
														{
															className: "right",
															"data" : "id"
														},
														{
															className: "right",
															"data" : "limite"
														},
														{
															"data" : "nome"
														},
														{
															"data" : "tipo"
														},
														{
															"defaultContent" : '<a href="${pageContext.request.contextPath}/admin/modifica-risorsa"><button type="button" class="btn btn-default btn-circle"> <i class="fa fa-pencil"></i> </button></a> <a href="${pageContext.request.contextPath}/admin/elimina-risorsa"><button type="button" class="btn btn-default btn-circle"> <i class="fa fa-trash-o"></i> </button></a>'
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