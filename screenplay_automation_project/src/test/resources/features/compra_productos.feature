#language:es

Característica: Verificar que el costo de la compra de productos en la pagina sea igual al total a pagar
  Como usuario de la pagina Advantage Online Shopping
  Yo deseo verificar que el costo total de mis productos
  Para realizar un pago acorde con los productos seleccionados


  Esquema del escenario: El realiza una compra en la pagina Advantage Online Shopping
    Dado que el usuario Pedro se loguea en la pagina
      | nombre_usuario   | contrasena   |
      | <nombre_usuario> | <contrasena> |
    Cuando ingresa los productos al carrito
    Y realiza el pago
    Entonces comprobar que el costo tota fue

    Ejemplos:
      | nombre_usuario | contrasena             | contrasena             | productos          | cantidad | total   | safepay_username | safepay_contrasena |
      | Pedro130Hello  | 416263313233343536642E | 416263313233343536642E | HP ELITEBOOK FOLIO | 1        | $169.99 | Pedro            | Abc123             |
