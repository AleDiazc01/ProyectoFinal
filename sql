/*Las líneas 2 y 3 están en comentarios, para usarse así la primera vez... luego de eso se quitan los comentarios para que todo funcione bien, en las siguientes ejecuciones */
/*drop schema recetasdecasa ;
drop user usuario_prueba;*/

/*Se crea la base de datos */
CREATE SCHEMA recetasdecasa ;
/*Se crea un usuario para la base de datos llamado "usuario_prueba" y tiene la contraseña "Usuario_Clave."*/
create user 'usuario_prueba'@'%' identified by 'Usuar1o_Clave.';
/*Se asignan los prvilegios sobr ela base de datos TechShop al usuario creado */
grant all privileges on recetasdecasa.* to 'usuario_prueba'@'%';
flush privileges;

/*Se crea la tabla de clientes llamada cliente... igual que la clase Cliente */
CREATE TABLE recetasdecasa.receta (
  id_receta INT NOT NULL AUTO_INCREMENT,
  nombre VARCHAR(50) NOT NULL,
  descripcion VARCHAR(120) NOT NULL,
  ingredientes TEXT NOT NULL,
  preparacion TEXT NOT NULL,
  PRIMARY KEY (`id_receta`))
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8mb4
COLLATE = utf8mb4_eo_0900_ai_ci;

/*Se insertan 3 registros en la tabla cliente como ejemplo */
INSERT INTO recetasdecasa.receta (id_receta, nombre, descripcion, ingredientes, preparacion) VALUES 
(1, 'Arroz con Pollo', 'Un plato tradicional de la cocina peruana que combina arroz, pollo, cebolla, ají amarillo, ajo y cilantro.', '1 taza de arroz, 4 presas de pollo, 1 cebolla picada, 1 ají amarillo picado, 2 dientes de ajo picados, 1/2 taza de cilantro picado', '1. Sofría la cebolla, el ají y el ajo en aceite hasta que estén dorados. 2. Agregue el pollo y cocine hasta que esté dorado. 3. Añada el arroz y mezcle bien. 4. Agregue agua suficiente para cubrir el arroz y deje cocinar hasta que el agua se haya absorbido. 5. Tape la olla y cocine a fuego bajo hasta que el arroz esté cocido. 6. Agregue cilantro picado y mezcle bien antes de servir.'),
(2, 'Ensalada César', 'Una ensalada de lechuga romana, crutones, parmesano y pollo. Se sirve con una salsa César.', '1 lechuga romana, 2 pechugas de pollo, 1/2 taza de crutones, 1/2 taza de queso parmesano rallado, 1/2 taza de salsa César', '1. Cocine las pechugas de pollo a la parrilla o a la plancha hasta que estén doradas. 2. Lave y corte la lechuga en trozos pequeños. 3. Agregue los crutones, el queso y la salsa César a la lechuga. 4. Corte el pollo en tiras y agregue a la ensalada antes de servir.'),
(3, 'Spaghetti a la Boloñesa', 'Una pasta italiana clásica con una salsa a base de carne de res, tomates y especias.', '1 paquete de spaghetti, 1/2 libra de carne molida, 1 lata de tomates pelados, 1 cebolla picada, 2 dientes de ajo picados, 1/4 taza de vino tinto, 1 cucharadita de orégano, 1 cucharadita de albahaca, Sal y pimienta', '1. Cocine la pasta según las instrucciones del paquete. 2. En una sartén, sofría la cebolla y el ajo en aceite hasta que estén dorados. 3. Agregue la carne molida y cocine hasta que esté dorada. 4. Agregue los tomates pelados, el vino tinto, el orégano y la albahaca. 5. Cocine a fuego medio hasta que la salsa espese. 6. Sirva la pasta con la salsa y queso parmesano rallado al gusto.'),
(4, 'Tacos de Carne Asada', 'Tacos mexicanos rellenos de carne asada, cebolla, cilantro y limón.', '1 libra de carne asada, 1 cebolla picada, 1/2 taza de cilantro picado, 1 limón, Sal y pimienta, Tortillas de maíz', '1. Cocine la carne asada a la parrilla o a la plancha hasta que esté dorada. 2. Corte la carne en tiras. 3. Caliente las tortillas de maíz en una sartén o en el horno. 4. Rellene cada tortilla con carne asada, cebolla, cilantro y limón. 5. Sirva caliente.');
