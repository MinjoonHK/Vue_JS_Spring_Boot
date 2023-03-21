module.exports = {
  devServer: {
    proxy: {
      '/api': { //api 라고 시작하면 밑에 주소로 우회할거야
        target: "http://localhost:8080",
        chargeOrigin: true,
      }
    }
  }
}