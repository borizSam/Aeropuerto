-- 🚩 Aeropuertos
INSERT INTO aeropuerto (id, nombre, ciudad) VALUES (1, 'Madrid-Barajas', 'Madrid');
INSERT INTO aeropuerto (id, nombre, ciudad) VALUES (2, 'El Prat', 'Barcelona');
INSERT INTO aeropuerto (id, nombre, ciudad) VALUES (3, 'Valencia-Manises', 'Valencia');
INSERT INTO aeropuerto (id, nombre, ciudad) VALUES (4, 'Málaga-Costa del Sol', 'Málaga');

-- ✈️ Aviones
INSERT INTO avion (id, modelo, capacidad) VALUES (1, 'Boeing 737', 180);
INSERT INTO avion (id, modelo, capacidad) VALUES (2, 'Airbus A320', 174);
INSERT INTO avion (id, modelo, capacidad) VALUES (3, 'Embraer E190', 100);
INSERT INTO avion (id, modelo, capacidad) VALUES (4, 'Boeing 777', 396);

-- 🛬 Vuelos
INSERT INTO vuelo (id, codigo_vuelo, fecha_salida, fecha_llegada, avion_id, origen_id, destino_id) VALUES
(1, 'IB100', '2025-03-25T08:00:00', '2025-03-25T09:30:00', 1, 1, 2),
(2, 'IB101', '2025-03-25T10:00:00', '2025-03-25T11:30:00', 2, 2, 3),
(3, 'IB102', '2025-03-25T12:00:00', '2025-03-25T13:45:00', 3, 3, 4),
(4, 'IB103', '2025-03-25T14:00:00', '2025-03-25T15:30:00', 4, 4, 1),
(5, 'IB104', '2025-03-25T16:00:00', '2025-03-25T17:45:00', 1, 1, 3),
(6, 'IB105', '2025-03-26T08:15:00', '2025-03-26T09:45:00', 2, 2, 4),
(7, 'IB106', '2025-03-26T10:30:00', '2025-03-26T12:00:00', 3, 3, 1),
(8, 'IB107', '2025-03-26T13:00:00', '2025-03-26T14:30:00', 4, 4, 2),
(9, 'IB108', '2025-03-26T15:00:00', '2025-03-26T16:30:00', 1, 1, 4),
(10, 'IB109', '2025-03-26T17:30:00', '2025-03-26T19:00:00', 2, 2, 1);
