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

							<span><a href="${pageContext.request.contextPath}/aggiungi-risorsa"><button
										type="button" class="btn btn-default btn-circle">
										<i class="fa fa-plus"></i>
									</button></a></span> <span>Aggiungi risorsa</span>
						</div>

						<table width="100%"
							class="table table-striped table-bordered table-hover"
							id="dataTables-example">
							<thead>
								<tr>
								<th>Id</th>
									<th>Limite</th>
									<th>Nome</th>
									<th>Risorsa</th>
									<th></th>
								</tr>
							</thead>
<!--  							<tbody>
								<tr class="odd gradeX">
									<td align="center">Macchina</td>
									<td align="center">Toyota Yaris</td>
									<td align="center">5</td>
									<td align="center"><a href="${pageContext.request.contextPath}/modifica-risorsa"><button
												type="button" class="btn btn-default btn-circle">
												<i class="fa fa-pencil"></i>
											</button></a>
									<button type="button" class="btn btn-default btn-circle">
											<i class="fa fa-trash-o"></i>
										</button></td>
								</tr>
								<tr class="gradeC">
									<td align="center">Portatile</td>
									<td align="center">Lenovo k5</td>
									<td align="center">1</td>
									<td align="center"><a href="${pageContext.request.contextPath}/modifica-risorsa"><button
												type="button" class="btn btn-default btn-circle">
												<i class="fa fa-pencil"></i>
											</button></a>
									<button type="button" class="btn btn-default btn-circle">
											<i class="fa fa-trash-o"></i>
										</button></td>
								</tr>
								<tr class="gradeU">
									<td align="center">Aula</td>
									<td align="center">A5</td>
									<td align="center">5</td>
									<td align="center"><a href="${pageContext.request.contextPath}/modifica-risorsa"><button
												type="button" class="btn btn-default btn-circle">
												<i class="fa fa-pencil"></i>
											</button></a>
									<button type="button" class="btn btn-default btn-circle">
											<i class="fa fa-trash-o"></i>
										</button></td>
								</tr>
							</tbody>-->
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
	<!-- /#page-wrapper -->
	    <!-- jQuery -->
    <script src="../vendor/jquery/jquery.min.js"></script>

    <!-- Bootstrap Core JavaScript -->
    <script src="../vendor/bootstrap/js/bootstrap.min.js"></script>

    <!-- Metis Menu Plugin JavaScript -->
    <script src="../vendor/metisMenu/metisMenu.min.js"></script>

    <!-- DataTables JavaScript -->
    <script src="../vendor/datatables/js/jquery.dataTables.min.js"></script>
    <script src="../vendor/datatables-plugins/dataTables.bootstrap.min.js"></script>
    <script src="../vendor/datatables-responsive/dataTables.responsive.js"></script>

    <!-- Custom Theme JavaScript -->
    <script src="../dist/js/sb-admin-2.js"></script>

    <!-- Page-Level Demo Scripts - Tables - Use for reference -->
        <script>
    $(document).ready(function() {
        $('#dataTables-example').DataTable({
        	"ajax":"/getrisorselist",
               	"columns": [
                    { "data": "id" },
                    { "data": "limite" },
                    { "data": "nome" },
                    { "data": "tipo"},
                    { "defaultContent": '<a href="${pageContext.request.contextPath}/modifica-risorsa"><button type="button" class="btn btn-default btn-circle"> <i class="fa fa-pencil"></i> </button></a> <button type="button" class="btn btn-default btn-circle"> <i class="fa fa-trash-o"></i> </button>'}
        ]

        });
    });
    </script>
</body>