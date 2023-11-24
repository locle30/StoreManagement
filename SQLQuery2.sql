ALTER TABLE Product
ADD Created_At datetime NOT NULL;

ALTER TABLE Product
ADD Updated_At datetime;

ALTER TABLE Product
ADD CONSTRAINT DF_Created_At 
DEFAULT GETDATE() FOR Created_At

ALTER TABLE Invoice
ADD Created_At datetime NOT NULL;

ALTER TABLE Invoice
ADD Updated_At datetime;

ALTER TABLE Invoice
ADD CONSTRAINT Inv_Created_At 
DEFAULT GETDATE() FOR Created_At

CREATE TRIGGER Update_Product ON ProductAFTER UPDATEAS
BEGIN
UPDATE Product
SET Updated_At = GETDATE()FROM Product
INNER JOIN inserted
ON Product.Product_ID = inserted.Product_ID;END;

CREATE TRIGGER Update_Invoice
ON InvoiceAFTER UPDATEAS
BEGIN
UPDATE Invoice
SET Updated_At = GETDATE()FROM Invoice
INNER JOIN inserted
ON Invoice.Invoice_ID = inserted.Invoice_ID;
END;

