<template>
  <div class="navbar-container">
    <div class="left-side">
      <div class="logo">
        <img width="180" src="../assets/Logo.svg" alt="" />
      </div>
      <div class="search-bar">
        <input
          type="text"
          placeholder="¿Que tipo de servicio estas buscando?"
        />
        <button>Buscar</button>
      </div>
    </div>
    <div class="nav-link">
      <a>Buscar</a>
      <a>Mis Servicios</a>
    </div>
  </div>
</template>

<script>
export default {
  name: "navbar"
};
</script>

<style>
.navbar-container {
  width: 100%;
  padding: 32px 96px;
  display: flex;
  justify-content: space-between;
  align-items: center;
}
.navbar-container .left-side{
  display: flex;
  align-items: center;
}
.navbar-container .left-side button{
    padding: 16px 32px;
  border: none;
  background: #FF3168;
  font-weight: 600;
  color: #ffffff;
  border-radius: 8px;
  font-size: 18px;
}
.navbar-container .left-side .search-bar{
  margin-left: 24px;
}
.navbar-container input{
    width: 320px;
  border-radius: 8px;
  border: none;
  background: #fcfcfc;
  padding: 16px;
  font-size: 16px;
  color: #323232;
  margin: 12px 0;
  border: 1px solid #fcfcfc;
  transition: all 0.2s ease-in-out;
}
.navbar-container .logo {
  display: flex;
}
.navbar-container .logo h1 {
  margin-left: 12px;
  color: #5f6caf;
}

.navbar-container .nav-link {
  padding-right: 96px;
}

.navbar-container .nav-link a {
  margin: 0 32px;
}
</style>
