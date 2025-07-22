
function validarLogin() {
  const usuario = document.getElementById('usuario').value;
  const password = document.getElementById('password').value;
  if (!usuario || !password) {
    alert('Por favor complete todos los campos.');
    return false;
  }
  alert('Inicio de sesión exitoso');
  return true;
}
function toggleMenu() {
  const menu = document.getElementById('menu');
  menu.classList.toggle('active');
}
