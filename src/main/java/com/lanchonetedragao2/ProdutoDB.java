package com.lanchonetedragao2;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class ProdutoDB {
    public List<Produto> buscaProduto(String tipo){
        String sql = "SELECT * FROM produtos WHERE tipo = ?";
        List<Produto> produtos=new ArrayList<>();
        try (Connection conn= Database.conectar(); PreparedStatement ps = conn.prepareStatement(sql)){
            ps.setString(1, tipo);
            ResultSet rs= ps.executeQuery();
            while(rs.next()){
                Produto prod=new Produto(
                        rs.getInt("id"),
                        rs.getString("nome"),
                        rs.getDouble("preco"),
                        rs.getString("desc"),
                        rs.getString("tipo")
                        );
                produtos.add(prod);
            }
        }catch (SQLException e){
            System.out.println("Erro ao buscar produtos: "+e.getMessage());
        }
        return produtos;
    }
}
