#language:es

Característica: Verificar que el registro de usuario funcione correctamente
  Como usuario de la pagina Advantage Online Shopping
  Yo deseo realizar el inicio de sesion a mi cuenta
  Para poder comprar productos online


  Esquema del escenario: El usuario inicia sesion en la pagina Advantage Online Shopping de manera exitosa
    Dado que el usuario Pedro abre la pagina web de Advantage Online Shopping
    Cuando ingresa sus credenciales
      | nombre_usuario   | contrasena   |
      | <nombre_usuario> | <contrasena> |
    Entonces debe poder navegar en la pagina
      | nombre_usuario   |
      | <nombre_usuario> |

    Ejemplos:
      | nombre_usuario | contrasena             |
      | Pedro139Hello  | 416263313233343536642E |


  Esquema del escenario: El usuario intenta iniciar sesion en la pagina Advantage Online Shopping de manera fallida
    Dado que el usuario Pedro abre la pagina web de Advantage Online Shopping
    Cuando ingresa sus credenciales
      | nombre_usuario   | contrasena   |
      | <nombre_usuario> | <contrasena> |
    Entonces debe obtener el mensaje de error
      | mensaje_error_contrasena_invalida   |
      | <mensaje_error_contrasena_invalida> |

    Ejemplos:
      | nombre_usuario | contrasena     | mensaje_error_contrasena_invalida |
      | Pedro139Hello  | 41656931323334 | Incorrect user name or password.  |