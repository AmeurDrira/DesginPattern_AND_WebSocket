
import java.io.Serializable;
import java.util.Date;

public class Entry implements Serializable {

	Date date;
	int identificateur;
	String commentaire;

	public Entry(Date date, int identificateur, String commentaire) {
		super();
		this.date = date;
		this.identificateur = identificateur;
		this.commentaire = commentaire;
	}

	@Override
	public String toString() {
		return "Entry [date=" + date + ", identificateur=" + identificateur + ", commentaire=" + commentaire + "]";
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public int getIdentificateur() {
		return identificateur;
	}

	public void setIdentificateur(int identificateur) {
		this.identificateur = identificateur;
	}

	public String getCommentaire() {
		return commentaire;
	}

	public void setCommentaire(String commentaire) {
		this.commentaire = commentaire;
	}

}
