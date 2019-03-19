package Ex6;
import java.util.Timer;
import java.util.TimerTask;
import Ex6.Sensor;

public class Controlador {
	    private int codSeguranca;
	    private boolean ativo = false;
	    private boolean alarmeativado = false;
	    private Alarme sirene = new Alarme("Sirene");
	    private Alarme campainha = new Alarme("Campainha");
	    private Sensor[] sensores = new Sensor[10];
	    private Timer t1;

	    public Controlador(int codSeguranca) {
	        this.codSeguranca = codSeguranca;
	        for (int x = 0; x < 10; x++) {
	            this.sensores[x] = new Sensor ("Sensor" + x);
	        }
	    }

	    public int getCodSeguranca() {
	        return codSeguranca;
	    }

	    public boolean Ativo() {
	        return ativo;
	    }

	    public void ligarSistema() {
	        this.t1 = new Timer();
	        for (Sensor Sensor : this.sensores) {
	            Sensor.ligar();
	        }
	        this.ativo = true;
	        TimerTask check = new TimerTask() {
	            public void run() {
	                verificarSensores();
	            }
	        };
	        this.t1.schedule(check, 1000, 1000);
	    }

	    public void desligarSistema() {
	        for (Sensor Sensor : this.sensores) {
	            t1.cancel();
	            Sensor.desativar();
	            if(Sensor.Ativado())
	                Sensor.desligar();
	        }
	        this.ativo = false;
	    }

	    public boolean verificarCodigo(int cod) {
	        return this.codSeguranca == cod;
	    }

	    public void ativarAlarmes(Sensor Sensor) {
	        if(!this.alarmeativado) {
	            this.alarmeativado = true;
	            this.sirene.ativar();
	            this.campainha.ativar();
	            System.out.println("------------------------- Atenção -----------------------");
	            System.out.println("Foi detectado presença na localização do: " + Sensor.getCodigo());
	            System.out.println("Digite o código de segurança para desativar!");
	            System.out.println("---------------------------------------------------------");
	        }
	    }

	    public void desativarAlarmes() {
	        this.alarmeativado = false;
	        this.sirene.desativar();
	        this.campainha.desativar();
	        for (Sensor Sensor : this.sensores) {
	            Sensor.desativar();
	        }
	    }

	    public boolean AlarmeAtivado() {
	        return alarmeativado;
	    }

	    public void verificarSensores() {
	        for (Sensor Sensor : this.sensores) {
	            if (Sensor.Ligado() && Sensor.Ativado()) {
	                this.ativarAlarmes(Sensor);
	            }
	        }
	    }

	    public void ligarSensor(String cod) {
	        boolean sensorAtivo = false;
	        for (Sensor Sensor : this.sensores) {
	            if (Sensor.getCodigo().equals(cod) && !Sensor.Ligado()) {
	                Sensor.ligar();
	                sensorAtivo = true;
	            }
	        }
	        if (!sensorAtivo) {
	            System.out.println("Código do sensor inválido!");
	        }
	    }

	    public void desligarSensor(String cod) {
	        boolean sensorDesativo = false;
	        for (Sensor Sensor : this.sensores) {
	            if (Sensor.getCodigo().equals(cod) && Sensor.Ligado()) {
	                Sensor.ligar();
	                sensorDesativo = true;
	            }
	        }
	        if (!sensorDesativo) {
	            System.out.println("Código do sensor inválido!");
	        }
	    }

	    public void testarSensor(String cod) {
	        boolean sensorTestado = false;
	        for (Sensor Sensor : this.sensores) {
	            if (Sensor.getCodigo().equals(cod) && Sensor.Ligado()) {
	                sensorTestado = true;
	                Sensor.ativar();
	            }
	        }
	        if (!sensorTestado) {
	            System.out.println("Código do sensor inválido!");
	        }
	    }

	    public void mostrarStatusSensores() {
	        System.out.println("Verificando Sensores...");
	        for (Sensor Sensor : this.sensores) {
	            System.out.println("Sensor - Código: " + Sensor.getCodigo() + " - Status: " + (Sensor.Ligado() ? "Ligado" : "Desligado") + " - " + (Sensor.Ativado() ? " Ativado" : "Desativado"));
	        }
	    }

	    public void mostrarSensoresLigados() {
	        int num = 0;
	        System.out.println("Sensores Ligados");
	        for (Sensor Sensor : this.sensores) {
	            if (Sensor.Ligado()) {
	                num++;
	                System.out.println("Sensor - Código: " + Sensor.getCodigo() + " - Status: " + (Sensor.Ligado() ? "Ligado" : "Desligado") + " - " + (Sensor.Ativado() ? " Ativado" : "Desativado"));
	            }
	        }
	        if (num == 0) {
	            System.out.println("Nenhum sensor está ligado!");
	        }
	    }

	    public void mostrarSensoresDesligados() {
	        int num = 0;
	        System.out.println("Sensores Desligados");
	        for (Sensor Sensor : this.sensores) {
	            if (!Sensor.Ligado()) {
	                num++;
	                System.out.println("Sensor - Código: " + Sensor.getCodigo() + "-Status: " + (Sensor.Ligado() ? "Ligado" : "Desligado") + " - " + (Sensor.Ativado() ? " Ativado" : "Desativado"));
	            }
	        }
	        if (num == 0) {
	            System.out.println("Nenhum sensor está desligado!");
	        }
	    }
	}