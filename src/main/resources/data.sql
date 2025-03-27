-- Aeropuertos
INSERT INTO aeropuerto (id, nombre, ciudad) VALUES (1, 'Aeropuerto A', 'Ciudad A');
INSERT INTO aeropuerto (id, nombre, ciudad) VALUES (2, 'Aeropuerto B', 'Ciudad B');
INSERT INTO aeropuerto (id, nombre, ciudad) VALUES (3, 'Aeropuerto C', 'Ciudad C');
INSERT INTO aeropuerto (id, nombre, ciudad) VALUES (4, 'Aeropuerto D', 'Ciudad D');
INSERT INTO aeropuerto (id, nombre, ciudad) VALUES (5, 'Aeropuerto E', 'Ciudad E');
-- Aviones
INSERT INTO avion (id, modelo, capacidad) VALUES (1, 'Modelo-1', 160);
INSERT INTO avion (id, modelo, capacidad) VALUES (2, 'Modelo-2', 170);
INSERT INTO avion (id, modelo, capacidad) VALUES (3, 'Modelo-3', 180);
INSERT INTO avion (id, modelo, capacidad) VALUES (4, 'Modelo-4', 190);
INSERT INTO avion (id, modelo, capacidad) VALUES (5, 'Modelo-5', 200);
-- Vuelos
INSERT INTO vuelo (id, destino, fecha_salida, fecha_llegada, avion_id, origen_id, destino_id)
VALUES (1, 'Ciudad B', '2025-04-02T09:00:00', '2025-04-02T13:00:00', 3, 1, 2);
INSERT INTO vuelo (id, destino, fecha_salida, fecha_llegada, avion_id, origen_id, destino_id)
VALUES (2, 'Ciudad E', '2025-04-03T08:00:00', '2025-04-03T10:00:00', 1, 1, 5);
INSERT INTO vuelo (id, destino, fecha_salida, fecha_llegada, avion_id, origen_id, destino_id)
VALUES (3, 'Ciudad D', '2025-04-04T08:00:00', '2025-04-04T13:00:00', 3, 1, 4);
INSERT INTO vuelo (id, destino, fecha_salida, fecha_llegada, avion_id, origen_id, destino_id)
VALUES (4, 'Ciudad D', '2025-04-05T11:00:00', '2025-04-05T15:00:00', 2, 2, 4);
INSERT INTO vuelo (id, destino, fecha_salida, fecha_llegada, avion_id, origen_id, destino_id)
VALUES (5, 'Ciudad B', '2025-04-06T09:00:00', '2025-04-06T12:00:00', 1, 4, 2);
INSERT INTO vuelo (id, destino, fecha_salida, fecha_llegada, avion_id, origen_id, destino_id)
VALUES (6, 'Ciudad A', '2025-04-07T08:00:00', '2025-04-07T11:00:00', 5, 2, 1);
INSERT INTO vuelo (id, destino, fecha_salida, fecha_llegada, avion_id, origen_id, destino_id)
VALUES (7, 'Ciudad B', '2025-04-08T09:00:00', '2025-04-08T10:00:00', 3, 3, 2);
INSERT INTO vuelo (id, destino, fecha_salida, fecha_llegada, avion_id, origen_id, destino_id)
VALUES (8, 'Ciudad A', '2025-04-09T10:00:00', '2025-04-09T14:00:00', 5, 5, 1);
INSERT INTO vuelo (id, destino, fecha_salida, fecha_llegada, avion_id, origen_id, destino_id)
VALUES (9, 'Ciudad E', '2025-04-10T10:00:00', '2025-04-10T15:00:00', 2, 4, 5);
INSERT INTO vuelo (id, destino, fecha_salida, fecha_llegada, avion_id, origen_id, destino_id)
VALUES (10, 'Ciudad A', '2025-04-11T08:00:00', '2025-04-11T13:00:00', 4, 4, 1);