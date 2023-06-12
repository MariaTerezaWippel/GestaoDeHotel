
package Controle;

import java.util.ArrayList;

import modelo.Funcionario;
import modelo.Reserva;

public class FuncionarioDao {

private static ArrayList<Funcionario> listaFuncionario;

private static FuncionarioDao funcionarioDao;

public static FuncionarioDao getIntancia() {
if (funcionarioDao == null) {
funcionarioDao = new FuncionarioDao();
listaFuncionario = new ArrayList<Funcionario>();
listaFuncionario.add(
new Funcionario("Bruna", 14058567937l, "bruna@gmail.com", "secretaria", "bruna18"));
}
return funcionarioDao;
}

public boolean inserirFuncionario(Funcionario funcionario) {
if (funcionario != null) {
FuncionarioDao.listaFuncionario.add(funcionario);
return true;
}
return false;
}

// DELETE
public boolean deletarFuncionario(Long cpfFuncionario) {
for (Funcionario f1 : listaFuncionario) {
if (f1.getCpf() == cpfFuncionario) {
listaFuncionario.remove(f1);
return true;
}
}

return false;
}

// UPDATE

public boolean alterarFuncionario(Funcionario funcionario) {
for (Funcionario f : listaFuncionario) {

if (f.getCpf().equals(funcionario.getCpf())) {
f.setEmail(funcionario.getEmail());
f.setFraseSecreta(funcionario.getFraseSecreta());
f.setCargo(funcionario.getCargo());
f.setNome(funcionario.getNome());
return true;
}
}
return false;
}

public boolean loginFuncionario(Funcionario funcionario) {
for (Funcionario f : listaFuncionario) {
if (f.getEmail().equals(funcionario.getEmail())
&& f.getFraseSecreta().equals(funcionario.getFraseSecreta())) {
return true;
}
}
return false;
}

public ArrayList<Funcionario> listaFuncionario() {
return FuncionarioDao.listaFuncionario;
}

public Funcionario consulta(Funcionario funcionario) {
Funcionario funci = new Funcionario();
for (Funcionario f : listaFuncionario) {

if (f.getCpf() == funcionario.getCpf()) {

funci.setEmail(f.getEmail());
funci.setFraseSecreta(f.getFraseSecreta());
funci.setCpf(f.getCpf());
funci.setCargo(f.getCargo());
funci.setNome(f.getNome());
return funci;
}
}

return null;
}


}
