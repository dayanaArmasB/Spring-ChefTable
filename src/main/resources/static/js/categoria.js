(function(){
    var listaBotonesEditar = document.querySelectorAll(".editarCategoria");
    listaBotonesEditar.forEach(item =>{
        item.addEventListener("click", e =>{
            //alert("Hiciste click en el boton");
            document.getElementById("id").value = item.dataset.id;
            document.getElementById("txtNombre").value = item.dataset.nombre;
            document.getElementById("txtDescripcion").value = item.dataset.descripcion;
            new bootstrap.Modal(document.getElementById('modalEditar')).show();
        });
    });
})();