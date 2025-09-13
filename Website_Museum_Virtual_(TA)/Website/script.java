// Fungsi untuk menghitung karakter
        document.getElementById('pesan').addEventListener('input', function() {
            const charCount = this.value.length;
            document.getElementById('charCount').textContent = charCount;
            
            // Batasi input hingga 500 karakter
            if (charCount > 500) {
                this.value = this.value.substring(0, 500);
                document.getElementById('charCount').textContent = 500;
            }
        });
        
        // Fungsi untuk pemilihan rating
        const ratingOptions = document.querySelectorAll('.rating-option');
        ratingOptions.forEach(option => {
            option.addEventListener('click', function() {
                ratingOptions.forEach(opt => opt.classList.remove('selected'));
                this.classList.add('selected');
                document.getElementById('rating').value = this.getAttribute('data-value');
            });
        });
        
        // Fungsi untuk menangani pengiriman form
        document.getElementById('feedbackForm').addEventListener('submit', function(e) {
            e.preventDefault();
            
            // Validasi sederhana
            const rating = document.getElementById('rating').value;
            if (!rating) {
                alert('Silakan pilih penilaian terlebih dahulu');
                return;
            }
            
            // Simulasi pengiriman data (dalam aplikasi nyata, ini akan mengirim ke server)
            setTimeout(() => {
                document.getElementById('feedback-form').style.display = 'none';
                document.getElementById('thank-you').style.display = 'block';
            }, 500);
        });
        
        // Fungsi untuk mereset form
        function resetForm() {
            document.getElementById('feedbackForm').reset();
            ratingOptions.forEach(opt => opt.classList.remove('selected'));
            document.getElementById('charCount').textContent = '0';
            document.getElementById('feedback-form').style.display = 'block';
            document.getElementById('thank-you').style.display = 'none';
        }