function highlightRow(row) {
    var cells = row.getElementsByTagName("td");
    for (var i = 0; i < cells.length; i++) {
        if (!cells[i].classList.contains('selected')) {
            cells[i].classList.add('selected');
        } else {
            cells[i].classList.remove('selected');
        }
    }
}

document.addEventListener('DOMContentLoaded', function() {
    var table = document.getElementById('example1');
    if (table) {
        var rows = table.getElementsByTagName('tr');
        for (var i = 0; i < rows.length; i++) {
            rows[i].addEventListener('click', function() {
                highlightRow(this);
            });
        }
    }
});
