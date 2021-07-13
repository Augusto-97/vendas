CREATE TABLE `Vendedor` (
  `id` INT NOT NULL AUTO_INCREMENT,
  `nome` VARCHAR(100) NOT NULL,
  PRIMARY KEY (`id`),
ENGINE = InnoDB;
 
CREATE TABLE `Vendas` (
  `id` INT NOT NULL AUTO_INCREMENT,
  `data_Venda` DATETIME NOT NULL,
  `vendedor_id` INT NOT NULL,
  `valor_venda` DOUBLE NOT NULL,
  PRIMARY KEY (`id`),
    FOREIGN KEY (`vendedor_id`)
    REFERENCES `vendedor` (`id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;

CREATE TABLE `Produto` (
  `id` INT NOT NULL AUTO_INCREMENT,
  `nome` VARCHAR(100) NOT NULL,
  `valor` DOUBLE  NOT NULL,
  PRIMARY KEY (`id`),

ENGINE = InnoDB;
