CREATE DATABASE IF NOT EXISTS BillingApp3;

CREATE TABLE BillingApp3.markets (
    `market_id` INT AUTO_INCREMENT,
    `ticker_symbol` VARCHAR(255),
    `current_price` DOUBLE,
    `price_change` DOUBLE,
PRIMARY KEY (market_id)) ENGINE=MyISAM DEFAULT CHARSET=latin1;

CREATE TABLE BillingApp3.users (
    `user_id` INT AUTO_INCREMENT,
    `user_name` VARCHAR(255),
    `email_address` VARCHAR(255),
PRIMARY KEY (user_id)) ENGINE=MyISAM DEFAULT CHARSET=latin1;

CREATE TABLE BillingApp3.portfolios (
    `portfolio_id` INT AUTO_INCREMENT,
    `portfolio_name` VARCHAR(255),
PRIMARY KEY (portfolio_id)) ENGINE=MyISAM DEFAULT CHARSET=latin1;

CREATE TABLE BillingApp3.trades (
    `trade_id` INT AUTO_INCREMENT,
    `trade_date` DATETIME,
    `quantity` INT,
PRIMARY KEY (trade_id)) ENGINE=MyISAM DEFAULT CHARSET=latin1;

USE drcvelocity;
