#language:es

  Característica: Verificar que el registro de usuario funcione correctamente
    Como usuario de la pagina Advantage Online Shopping
    Yo deseo realizar el registro de mi cuenta
    Para poder comprar productos online


    Esquema del escenario: El usuario se registra en la pagina Advantage Online Shopping de manera exitosa
      Dado que el usuario Pedro abre la pagina web de Advantage Online Shopping
      Cuando se registra con los datos
        | nombre_usuario   | correo   | contrasena   | confirmar_contrasena   | nombre   | apellido   | telefono   | pais   | ciudad   | direccion   | estado   | codigo_postal   |
        | <nombre_usuario> | <correo> | <contrasena> | <confirmar_contrasena> | <nombre> | <apellido> | <telefono> | <pais> | <ciudad> | <direccion> | <estado> | <codigo_postal> |
      Entonces debe poder navegar en la pagina
        | nombre_usuario   |
        | <nombre_usuario> |

      Ejemplos:
        | nombre_usuario | correo           | contrasena             | confirmar_contrasena   | nombre | apellido | telefono   | pais     | ciudad    | direccion   | estado | codigo_postal |
        | Pedro150Hello  | pedro2@gmail.com | 416263313233343536642E | 416263313233343536642E | Pedro  | Perez    | 3113113113 | Colombia | Manizales | Calle 5 sur | Caldas | 17001         |


    Esquema del escenario: El usuario intenta registrarse en la pagina Advantage Online Shopping con un nombre de usuario que ya esta registrado
      Dado que el usuario Pedro abre la pagina web de Advantage Online Shopping
      Cuando se registra con los datos
        | nombre_usuario   | correo   | contrasena   | confirmar_contrasena   | nombre   | apellido   | telefono   | pais   | ciudad   | direccion   | estado   | codigo_postal   |
        | <nombre_usuario> | <correo> | <contrasena> | <confirmar_contrasena> | <nombre> | <apellido> | <telefono> | <pais> | <ciudad> | <direccion> | <estado> | <codigo_postal> |
      Entonces debe recibir el mensaje de error
        | mensaje_error_usuario_existente   |
        | <mensaje_error_usuario_existente> |

      Ejemplos:
        | nombre_usuario | correo           | contrasena             | confirmar_contrasena   | nombre | apellido | telefono   | pais     | ciudad    | direccion   | estado | codigo_postal | mensaje_error_usuario_existente |
        | Pedro130Hello  | pedro2@gmail.com | 416263313233343536642E | 416263313233343536642E | Pedro  | Perez    | 3113113113 | Colombia | Manizales | Calle 5 sur | Caldas | 17001         | User name already exists        |
