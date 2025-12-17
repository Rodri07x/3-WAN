-- Listar todos los deportistas
SELECT * FROM Deportista;

-- Ver ediciones de eventos que ocurren en 'Guayaquil'
SELECT e.*
FROM Edición e
JOIN Celebra c ON e.NdeEdición = c.NdeEdición
WHERE c.Nombre = 'Guayaquil';

-- Productos con stock mayor a 100
SELECT * FROM Productos
WHERE Stock > 100;


-- Deportistas inscritos en más de un evento
SELECT d.Nombre, COUNT(*) AS CantidadEventos
FROM Deportista d
JOIN Participación p ON d.DNI = p.DNI
GROUP BY d.DNI
HAVING COUNT(*) > 1;

-- Eventos y su fecha ordenados cronológicamente
SELECT e.Nombre AS Evento, ed.Fecha
FROM Evento e
JOIN Edición ed ON e.CodEvento = ed.CodEvento
ORDER BY ed.Fecha;

-- Total de productos por categoría
SELECT Categoria, COUNT(*) AS TotalProductos
FROM Productos
GROUP BY Categoria;


-- Deportistas con participación y ciudad donde se realizó el evento
SELECT 
    d.Nombre AS Deportista,
    ev.Nombre AS Evento,
    c.Nombre AS Ciudad
FROM Deportista d
JOIN Participación p ON d.DNI = p.DNI
JOIN Edición ed ON p.NdeEdición = ed.NdeEdición
JOIN Evento ev ON ed.CodEvento = ev.CodEvento
JOIN Celebra ce ON ed.NdeEdición = ce.NdeEdición
JOIN Ciudad c ON ce.Provincia = c.Provincia 
             AND ce.Nombre = c.Nombre;


-- Eventos con más participantes
SELECT ev.Nombre, COUNT(p.DNI) AS Participantes
FROM Evento ev
JOIN Edición ed ON ev.CodEvento = ed.CodEvento
JOIN Participación p ON ed.NdeEdición = p.NdeEdición
GROUP BY ev.CodEvento
ORDER BY Participantes DESC;

-- Productos con bajo stock (< 100)
SELECT Nombre, Stock
FROM Productos
WHERE Stock < 100
ORDER BY Stock;
