package Controle;

import java.util.ArrayList;

import modelo.Endereco;
import modelo.Funcionario;
import modelo.Hospede;
import modelo.Reserva;

public class ReservaDao {

private static ArrayList<Reserva> listaReserva;

private static ReservaDao reservaDao;

public static ReservaDao getIntancia() {
if (reservaDao == null) {
reservaDao = new ReservaDao ();
listaReserva = new ArrayList<Reserva>();
}
return reservaDao;
}

public boolean inserirReserva(Reserva reserva) {
if (reserva != null) {
ReservaDao.listaReserva.add(reserva);
return true;
}
return false;
}

public boolean deletarReserva(Reserva reserva) {
for (Reserva r : listaReserva) {
if (r.getHospede().getCpf().equals(reserva.getHospede().getCpf())) {
listaReserva.remove(r);
return true;
}
}
return false;
}

public boolean alterarReserva(Reserva reserva) {
for (Reserva r : listaReserva) {

if (r.getHospede().getCpf().equals(reserva.getHospede().getCpf())) {
r.setCodigoQuarto(reserva.getCodigoQuarto());
r.setDiaria(reserva.getDiaria());
r.setFormaPagamento(reserva.getFormaPagamento());
r.setHospede(reserva.getHospede());
r.setQuantidadeDedias(reserva.getQuantidadeDedias());
r.setQuantidadeHospede(reserva.getQuantidadeHospede());
r.setServicoQuarto(reserva.getServicoQuarto());
return true;
}
}
return false;
}

public ArrayList<Reserva> consultarReserva(Reserva reserva) {
Reserva objetoReserva = new Reserva();
ArrayList<Reserva>  listReserva = new ArrayList<Reserva>();
for (Reserva reser : listaReserva) {

if (reser.getCodigoQuarto() == reserva.getCodigoQuarto()) {
objetoReserva.setCodigoQuarto(reserva.getCodigoQuarto());
objetoReserva.setDiaria(reserva.getDiaria());
objetoReserva.setFormaPagamento(reserva.getFormaPagamento());
objetoReserva.setHospede(reserva.getHospede());
objetoReserva.setQuantidadeDedias(reserva.getQuantidadeDedias());
objetoReserva.setQuantidadeHospede(reserva.getQuantidadeHospede());
objetoReserva.setServicoQuarto(reserva.getServicoQuarto());
listReserva.add(objetoReserva);
}
}
return listReserva;
}
public ArrayList<Reserva>listaReserva(){
return ReservaDao.listaReserva;
}
}