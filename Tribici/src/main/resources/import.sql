INSERT INTO usuario (id, nombre, numTarjeta, pin, saldo)
VALUES
(1, 'Juan Pérez', '1111222233334444', 1234, 25.50),
(2, 'María López', '5555666677778888', 4321, 10.00),
(3, 'Carlos Ruiz', '9999000011112222', 9876, 0.00),
(4, 'Ana Torres', '4444333322221111', 2468, 50.75),
(5, 'Lucía Gómez', '1212121212121212', 1357, 5.20),
(6, 'Pedro Sánchez', '8888777766665555', 2020, 12.30),
(7, 'Sofía Martín', '1010101010101010', 9090, 100.00),
(8, 'Raúl García', '3333444455556666', 1111, 3.75),
(9, 'Elena Romero', '7777888899990000', 2222, 42.10),
(10, 'Miguel Ángel', '6666555544443333', 3333, 0.50);

INSERT INTO uso (id, fecha_inicio, fecha_fin, coste, estacion_id, bicicleta_id, usuario_id)
VALUES
(1, '2024-01-10', '2024-01-10', 1.50, 2, 1, 1),
(2, '2024-01-12', '2024-01-12', 2.00, 3, 2, 2),
(3, '2024-01-15', '2024-01-15', 0.75, 1, 3, 3),
(4, '2024-01-18', '2024-01-18', 1.20, 4, 4, 4),
(5, '2024-01-20', '2024-01-20', 3.10, 5, 5, 5),
(6, '2024-02-01', '2024-02-01', 1.80, 3, 1, 1),
(7, '2024-02-03', '2024-02-03', 2.50, 4, 2, 2),
(8, '2024-02-05', '2024-02-05', 0.90, 2, 3, 3),
(9, '2024-02-07', '2024-02-07', 1.40, 1, 4, 4),
(10, '2024-02-10', '2024-02-10', 2.75, 5, 5, 5);

INSERT INTO bicicleta (id, marca, modelo, estados, estacion_id) VALUES(1, 'Orbea', 'Urban 100', 'DISPONIBLE', 1),
INSERT INTO bicicleta (id, marca, modelo, estados, estacion_id) VALUES(2, 'Specialized', 'Sirrus X', 'DISPONIBLE', 1),
(3, 'Trek', 'FX 2', 'EN_USO', 2),
(4, 'Giant', 'Escape 3', 'MANTENIMIENTO', 3),
(5, 'Cannondale', 'Quick 4', 'DISPONIBLE', 4),
(6, 'Bianchi', 'C-Sport', 'DISPONIBLE', 5),
(7, 'Merida', 'Crossway 20', 'EN_USO', 2),
(8, 'Scott', 'Sub Cross', 'DISPONIBLE', 3),
(9, 'Cube', 'Hyde Pro', 'MANTENIMIENTO', 4),
(10, 'BH', 'Core Street', 'DISPONIBLE', 5);


INSERT INTO estacion (id, numero, nombre, coordenadas, capacidad)
VALUES
(1, 101, 'Estación Triana - Plaza del Altozano', '37.3839,-5.9991', 15),
(2, 102, 'Estación Nervión - Gran Plaza', '37.3823,-5.9670', 20),
(3, 103, 'Estación Centro - Plaza Nueva', '37.3891,-5.9957', 25),
(4, 104, 'Estación Macarena - Parlamento', '37.4033,-5.9869', 18),
(5, 105, 'Estación Los Remedios - Virgen de Luján', '37.3738,-6.0035', 22),
(6, 106, 'Estación Santa Justa - Estación AVE', '37.3920,-5.9750', 30),
(7, 107, 'Estación Cartuja - Isla de la Cartuja', '37.4100,-6.0070', 20),
(8, 108, 'Estación Heliópolis - Reina Mercedes', '37.3595,-5.9860', 16),
(9, 109, 'Estación Alameda - Calle Calatrava', '37.3990,-5.9950', 18),
(10, 110, 'Estación San Bernardo - Enlace Metro/Tren', '37.3828,-5.9765', 24);
