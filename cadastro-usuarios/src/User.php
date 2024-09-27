<?php

namespace App;

use App\Database;
use PDO;

class User
{
    private $conn;
    private $table = 'usuarios';

    public function __construct()
    {
        $database = new Database();
        $this->conn = $database->connect();
    }

    public function create($nome, $email, $senha, $produto)
    {
        $sql = "INSERT INTO $this->table (nome, email, senha, produto) VALUES (:nome, :email, :senha, :produto)";
        $stmt = $this->conn->prepare($sql);

        $hashedPassword = password_hash($senha, PASSWORD_DEFAULT);

        $stmt->bindParam(':nome', $nome);
        $stmt->bindParam(':email', $email);
        $stmt->bindParam(':senha', $hashedPassword);
        $stmt->bindParam(':produto', $produto);

        if ($stmt->execute()) {
            return true;
        } else {
            return false;
        }
    }
}