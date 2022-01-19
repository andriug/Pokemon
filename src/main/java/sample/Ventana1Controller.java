package sample;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ProgressBar;

import javafx.scene.image.ImageView;
import javafx.scene.image.Image;
import java.io.File;
import java.net.MalformedURLException;


public class Ventana1Controller {

	Pokemon poke1=new Pokemon("Mew",100,100,"Nv 100","src\\main\\resources\\Image\\mew.gif","src\\main\\resources\\Image\\sex.png","src\\main\\resources\\Image\\tic.png");
	Pokemon poke2=new Pokemon("Gengar",100,100,"Nv 100", "src\\main\\resources\\Image\\gengar.gif", "src\\main\\resources\\Image\\sex.png", "src\\main\\resources\\Image\\tic.png");
	Pokemon poke3=new Pokemon("Dragonite",100,100,"Nv 100", "src\\main\\resources\\Image\\dragonite.gif","src\\main\\resources\\Image\\sex.png","src\\main\\resources\\Image\\tic.png");
	Pokemon poke4=new Pokemon("Blastoise",100,100,"Nv 100", "src\\main\\resources\\Image\\blastoise.gif","src\\main\\resources\\Image\\sex.png","src\\main\\resources\\Image\\tic.png");
	Pokemon poke5=new Pokemon("Alakazam",100,100,"Nv 100", "src\\main\\resources\\Image\\alakazam.gif","src\\main\\resources\\Image\\sex.png","src\\main\\resources\\Image\\tic.png");
	Pokemon poke6=new Pokemon("Aracanine",100,100,"Nv 100", "src\\main\\resources\\Image\\arcanine.gif","src\\main\\resources\\Image\\sex.png","src\\main\\resources\\Image\\tic.png");

	@FXML
	Button b1;
	@FXML
	Button b2;
	@FXML
	Label labelPokemon1;
	@FXML
	Label labelPokemon2;
	@FXML
	Label labelPokemon3;
	@FXML
	Label labelPokemon4;
	@FXML
	Label labelPokemon5;
	@FXML
	Label labelPokemon6;
	@FXML
	Label Npokemon1;
	@FXML
	Label Npokemon2;
	@FXML
	Label Npokemon3;
	@FXML
	Label Npokemon4;
	@FXML
	Label Npokemon5;
	@FXML
	Label Npokemon6;
	@FXML
	ImageView p1;
	@FXML
	ImageView p2;
	@FXML
	ImageView p3;
	@FXML
	ImageView p4;
	@FXML
	ImageView p5;
	@FXML
	ImageView p6;
	@FXML
	ImageView sex1;
	@FXML
	ImageView sex2;
	@FXML
	ImageView sex3;
	@FXML
	ImageView sex4;
	@FXML
	ImageView sex5;
	@FXML
	ImageView sex6;
	@FXML
	ProgressBar barra1;
	@FXML
	ProgressBar barra2;
	@FXML
	ProgressBar barra3;
	@FXML
	ProgressBar barra4;
	@FXML
	ProgressBar barra5;
	@FXML
	ProgressBar barra6;
	@FXML
	ImageView tic1;
	@FXML
	ImageView tic2;
	@FXML
	ImageView tic3;
	@FXML
	ImageView tic4;
	@FXML
	ImageView tic5;
	@FXML
	ImageView tic6;
	@FXML
	Label vida1;
	@FXML
	Label vida2;
	@FXML
	Label vida3;
	@FXML
	Label vida4;
	@FXML
	Label vida5;
	@FXML
	Label vida6;


	@FXML
	public void initialize(){
		labelPokemon1.setText(poke1.nombre);
		labelPokemon2.setText(poke2.nombre);
		labelPokemon3.setText(poke3.nombre);
		labelPokemon4.setText(poke4.nombre);
		labelPokemon5.setText(poke5.nombre);
		labelPokemon6.setText(poke6.nombre);
		Npokemon1.setText(poke1.nivel);
		Npokemon2.setText(poke2.nivel);
		Npokemon3.setText(poke3.nivel);
		Npokemon4.setText(poke4.nivel);
		Npokemon5.setText(poke5.nivel);
		Npokemon6.setText(poke6.nivel);
		p1.setImage(poke1.foto);
		p2.setImage(poke2.foto);
		p3.setImage(poke3.foto);
		p4.setImage(poke4.foto);
		p5.setImage(poke5.foto);
		p6.setImage(poke6.foto);
		sex1.setImage(poke1.sexo);
		sex2.setImage(poke2.sexo);
		sex3.setImage(poke3.sexo);
		sex4.setImage(poke4.sexo);
		sex5.setImage(poke5.sexo);
		sex6.setImage(poke6.sexo);
		barra1.setProgress(poke1.vidaActual/poke1.vidaMaxima);
		barra2.setProgress(poke2.vidaActual/poke1.vidaMaxima);
		barra3.setProgress(poke3.vidaActual/poke1.vidaMaxima);
		barra4.setProgress(poke4.vidaActual/poke1.vidaMaxima);
		barra5.setProgress(poke5.vidaActual/poke1.vidaMaxima);
		barra6.setProgress(poke6.vidaActual/poke1.vidaMaxima);
		tic1.setImage(poke1.estaVivo);
		tic2.setImage(poke2.estaVivo);
		tic3.setImage(poke3.estaVivo);
		tic4.setImage(poke4.estaVivo);
		tic5.setImage(poke5.estaVivo);
		tic6.setImage(poke6.estaVivo);
		vida1.setText(poke1.vidaActual+"/"+poke1.vidaMaxima);
		vida2.setText(poke2.vidaActual+"/"+poke2.vidaMaxima);
		vida3.setText(poke3.vidaActual+"/"+poke3.vidaMaxima);
		vida4.setText(poke4.vidaActual+"/"+poke4.vidaMaxima);
		vida5.setText(poke5.vidaActual+"/"+poke5.vidaMaxima);
		vida6.setText(poke6.vidaActual+"/"+poke6.vidaMaxima);

	}


	public class Pokemon{
		String nombre;
		int vidaMaxima;
		int vidaActual;
		String nivel;
		Image foto;
		Image sexo;
		Image estaVivo;

		public Pokemon(String nombre,int vidaMaxima,int vidaActual,String nivel,String foto,String sexo,String estaVivo){
			this.nombre=nombre;
			this.vidaMaxima=vidaMaxima;
			this.vidaActual=vidaActual;
			this.nivel=nivel;
			File f = new File(foto);
			try {
				Image i = new Image(f.toURI().toURL().toString());
				this.foto= i;
			} catch (MalformedURLException e) {
				e.printStackTrace();
			}
			File f2 = new File(sexo);
			try {
				Image i2 = new Image(f2.toURI().toURL().toString());
				this.sexo= i2;
			} catch (MalformedURLException e) {
				e.printStackTrace();
			}
			File f3 = new File(estaVivo);
			try {
				Image i3 = new Image(f3.toURI().toURL().toString());
				this.estaVivo= i3;
			} catch (MalformedURLException e) {
				e.printStackTrace();
			}
		}

	}

}