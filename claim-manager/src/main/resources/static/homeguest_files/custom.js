document.getElementById('file-upload').addEventListener('change', function(event) {
    const fileList = event.target.files;
    const documentList = document.getElementById('document-list');

    Array.from(fileList).forEach(file => {
        const fileType = file.type.split('/')[1].toUpperCase();
        const uploadDate = new Date().toISOString().split('T')[0];

        const row = document.createElement('tr');

        const fileNameCell = document.createElement('td');
        fileNameCell.textContent = file.name;

        const fileTypeCell = document.createElement('td');
        fileTypeCell.textContent = fileType;

        const uploadDateCell = document.createElement('td');
        uploadDateCell.textContent = uploadDate;

        const actionCell = document.createElement('td');
        const viewButton = document.createElement('button');
        viewButton.className = 'btn btn-brand-2nd';
        viewButton.style.marginRight = '2%';
        viewButton.textContent = 'Xem';
        viewButton.addEventListener('click', () => {
            // Handle file view action
            const url = URL.createObjectURL(file);
            window.open(url, '_blank');
        });

        const deleteButton = document.createElement('button');
        deleteButton.className = 'btn btn-brand-2nd';
        deleteButton.textContent = 'Xóa';
        deleteButton.addEventListener('click', () => {
            row.remove();
        });

        actionCell.appendChild(viewButton);
        actionCell.appendChild(deleteButton);

        row.appendChild(fileNameCell);
        row.appendChild(fileTypeCell);
        row.appendChild(uploadDateCell);
        row.appendChild(actionCell);

        documentList.appendChild(row);
    });
});