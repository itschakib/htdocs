/* =========================================================
   RESOLUCIÓN: 30 EJERCICIOS DE JOIN (Fábrica de Frutas)
   ========================================================= */

-- 1. Lista el nombre y apellidos de cada empleado junto con el nombre de su turno.
SELECT e.nombre, e.apellidos, t.nombre AS nombre_turno
FROM empleado e
INNER JOIN turno t ON e.id_turno = t.id_turno;

-- 2. Muestra los empleados y el nombre de la línea de producción en la que trabajan (solo empleados con línea asignada).
SELECT e.nombre, e.apellidos, lp.nombre AS nombre_linea
FROM empleado e
INNER JOIN linea_produccion lp ON e.id_linea = lp.id_linea;

-- 3. Muestra cada recepción indicando: id_recepcion, fecha_recepcion, kg y el nombre de la fruta recibida.
SELECT rf.id_recepcion, rf.fecha_recepcion, rf.kg, f.nombre AS nombre_fruta
FROM recepcion_fruta rf
INNER JOIN fruta f ON rf.id_fruta = f.id_fruta;

-- 4. Muestra cada recepción indicando: id_recepcion, nombre del proveedor, kg y precio_kg.
SELECT rf.id_recepcion, p.nombre AS nombre_proveedor, rf.kg, rf.precio_kg
FROM recepcion_fruta rf
INNER JOIN proveedor p ON rf.id_proveedor = p.id_proveedor;

-- 5. Muestra cada control de calidad con: id_control, resultado y el nombre y apellidos del empleado que lo realizó.
SELECT cc.id_control, cc.resultado, e.nombre, e.apellidos
FROM control_calidad cc
INNER JOIN empleado e ON cc.id_empleado = e.id_empleado;

-- 6. Lista los pedidos mostrando: id_pedido, fecha_pedido, nombre del cliente y ciudad del cliente.
SELECT p.id_pedido, p.fecha_pedido, c.nombre AS nombre_cliente, c.ciudad
FROM pedido p
INNER JOIN cliente c ON p.id_cliente = c.id_cliente;

-- 7. Muestra las líneas de pedido con: id_pedido, num_linea, nombre del producto y unidades.
-- (Se usa LEFT JOIN porque hay líneas mal informadas con id_producto a NULL)
SELECT lp.id_pedido, lp.num_linea, p.nombre AS nombre_producto, lp.unidades
FROM linea_pedido lp
LEFT JOIN producto p ON lp.id_producto = p.id_producto;

-- 8. Lista cliente, pedido y líneas de pedido mostrando: nombre del cliente, id_pedido, num_linea y unidades.
SELECT c.nombre AS nombre_cliente, p.id_pedido, lp.num_linea, lp.unidades
FROM cliente c
INNER JOIN pedido p ON c.id_cliente = p.id_cliente
INNER JOIN linea_pedido lp ON p.id_pedido = lp.id_pedido;

-- 9. Muestra los productos con el nombre de su categoría.
-- (Se usa LEFT JOIN porque hay productos sin categorizar)
SELECT p.nombre AS nombre_producto, cp.nombre AS nombre_categoria
FROM producto p
LEFT JOIN categoria_producto cp ON p.id_categoria = cp.id_categoria;

-- 10. Muestra el nombre del producto, la fruta y el porcentaje de la receta para cada ingrediente.
SELECT p.nombre AS nombre_producto, f.nombre AS nombre_fruta, r.porcentaje
FROM receta r
INNER JOIN producto p ON r.id_producto = p.id_producto
INNER JOIN fruta f ON r.id_fruta = f.id_fruta;

-- 11. Muestra los lotes de producción con: id_lote, fecha_lote, nombre del producto y unidades.
SELECT lp.id_lote, lp.fecha_lote, p.nombre AS nombre_producto, lp.unidades
FROM lote_produccion lp
INNER JOIN producto p ON lp.id_producto = p.id_producto;

-- 12. Muestra los lotes indicando: id_lote, nombre de la línea, nombre del turno y unidades.
SELECT lp.id_lote, li.nombre AS nombre_linea, t.nombre AS nombre_turno, lp.unidades
FROM lote_produccion lp
INNER JOIN linea_produccion li ON lp.id_linea = li.id_linea
INNER JOIN turno t ON lp.id_turno = t.id_turno;

-- 13. Lista todos los empleados con el nombre de su línea (incluye empleados sin línea).
SELECT e.nombre, e.apellidos, lp.nombre AS nombre_linea
FROM empleado e
LEFT JOIN linea_produccion lp ON e.id_linea = lp.id_linea;

-- 14. Lista todas las recepciones con el nombre de su línea asignada (incluye recepciones sin línea).
SELECT rf.id_recepcion, lp.nombre AS nombre_linea
FROM recepcion_fruta rf
LEFT JOIN linea_produccion lp ON rf.id_linea = lp.id_linea;

-- 15. Lista todos los proveedores con el nombre de su finca (incluye proveedores sin finca).
SELECT p.nombre AS nombre_proveedor, f.nombre AS nombre_finca
FROM proveedor p
LEFT JOIN finca f ON p.id_finca = f.id_finca;

-- 16. Lista todas las categorías con sus productos (incluye categorías sin productos).
SELECT cp.nombre AS nombre_categoria, p.nombre AS nombre_producto
FROM categoria_producto cp
LEFT JOIN producto p ON cp.id_categoria = p.id_categoria;

-- 17. Lista todos los clientes con sus pedidos (incluye clientes sin pedidos).
SELECT c.nombre AS nombre_cliente, p.id_pedido
FROM cliente c
LEFT JOIN pedido p ON c.id_cliente = p.id_cliente;

-- 18. Lista todos los pedidos con su envío (incluye pedidos sin envío).
SELECT p.id_pedido, p.estado, e.id_envio, e.fecha_envio
FROM pedido p
LEFT JOIN envio e ON p.id_pedido = e.id_pedido;

-- 19. Lista todos los pedidos con su envío y el nombre del transportista, si existe.
SELECT p.id_pedido, e.id_envio, t.nombre AS nombre_transportista
FROM pedido p
LEFT JOIN envio e ON p.id_pedido = e.id_pedido
LEFT JOIN transportista t ON e.id_transportista = t.id_transportista;

-- 20. Lista todas las recepciones con el resultado del control de calidad, si existe (incluye recepciones sin control).
SELECT rf.id_recepcion, cc.resultado AS resultado_calidad
FROM recepcion_fruta rf
LEFT JOIN control_calidad cc ON rf.id_recepcion = cc.id_recepcion;

-- 21. Lista categorías y productos usando RIGHT JOIN (incluye categorías sin productos).
SELECT cp.nombre AS nombre_categoria, p.nombre AS nombre_producto
FROM producto p
RIGHT JOIN categoria_producto cp ON p.id_categoria = cp.id_categoria;

-- 22. Lista clientes y pedidos usando RIGHT JOIN (incluye clientes sin pedidos).
SELECT c.nombre AS nombre_cliente, p.id_pedido
FROM pedido p
RIGHT JOIN cliente c ON p.id_cliente = c.id_cliente;

-- 23. Lista líneas de producción y recepciones usando RIGHT JOIN (incluye líneas sin recepciones).
SELECT lp.nombre AS nombre_linea, rf.id_recepcion
FROM recepcion_fruta rf
RIGHT JOIN linea_produccion lp ON rf.id_linea = lp.id_linea;

-- 24. Muestra líneas y recepciones usando FULL OUTER JOIN (incluye líneas sin recepciones y recepciones sin línea).
SELECT lp.nombre AS nombre_linea, rf.id_recepcion
FROM linea_produccion lp
FULL OUTER JOIN recepcion_fruta rf ON lp.id_linea = rf.id_linea;

-- 25. Muestra categorías y productos usando FULL OUTER JOIN (incluye ambos lados sin correspondencia).
SELECT cp.nombre AS nombre_categoria, p.nombre AS nombre_producto
FROM categoria_producto cp
FULL OUTER JOIN producto p ON cp.id_categoria = p.id_categoria;

-- 26. Muestra clientes y pedidos usando FULL OUTER JOIN.
SELECT c.nombre AS nombre_cliente, p.id_pedido
FROM cliente c
FULL OUTER JOIN pedido p ON c.id_cliente = p.id_cliente;

-- 27. Genera la matriz de combinaciones turno - línea (todas las combinaciones) usando CROSS JOIN.
SELECT t.nombre AS nombre_turno, lp.nombre AS nombre_linea
FROM turno t
CROSS JOIN linea_produccion lp;

-- 28. Genera la matriz turno - línea pero solo para líneas activas.
SELECT t.nombre AS nombre_turno, lp.nombre AS nombre_linea
FROM turno t
CROSS JOIN linea_produccion lp
WHERE lp.activo = 'S';

-- 29. Lista recetas y su producto usando NATURAL JOIN (columna común id_producto).
SELECT *
FROM receta
NATURAL JOIN producto;

-- 30. Lista pedidos y envíos usando NATURAL JOIN (columna común id_pedido).
SELECT *
FROM pedido
NATURAL JOIN envio;