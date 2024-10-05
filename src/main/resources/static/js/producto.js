(function(){
    var listaBotonesEditar = document.querySelectorAll(".editarProducto");
    listaBotonesEditar.forEach(item =>{
        item.addEventListener("click", e =>{
            //alert("Hiciste click en el boton");
            document.getElementById("id").value = item.dataset.id;
            document.getElementById("cboCategoria").value = item.dataset.categoria;
            document.getElementById("txtNombre").value = item.dataset.nombre;
            document.getElementById("txtCantidad").value = item.dataset.cantidad;
            document.getElementById("txtPrecio").value = item.dataset.precio;
            new bootstrap.Modal(document.getElementById('modalEditar')).show();
        });
    });
})();