package com.t6.clinicapp.models;

public class PortalModel {

    private String urlImageBannerUno;
	private String urlImageBannerDos;
	private String urlImageBannerTres;
	private String urlImageBannerCuatro;
	private String tittleTextSlideUno;
    private String textSlideUno;
	private String tittleTextSlideDos;
    private String textSlideDos;
	private String tittleTextSlideTres;
    private String textSlideTres;
	private String tittleTextSlideCuatro;
    private String textSlideCuatro;
	private String imageFavicon32;
	private String imageFavicon64;
   
    public PortalModel() {
    }

    public PortalModel(String urlImageBannerUno, String urlImageBannerDos, String urlImageBannerTres,
            String urlImageBannerCuatro, String tittleTextSlideUno, String textSlideUno, String tittleTextSlideDos,
            String textSlideDos, String tittleTextSlideTres, String textSlideTres, String tittleTextSlideCuatro,
            String textSlideCuatro, String imageFavicon32, String imageFavicon64) {
        this.urlImageBannerUno = urlImageBannerUno;
        this.urlImageBannerDos = urlImageBannerDos;
        this.urlImageBannerTres = urlImageBannerTres;
        this.urlImageBannerCuatro = urlImageBannerCuatro;
        this.tittleTextSlideUno = tittleTextSlideUno;
        this.textSlideUno = textSlideUno;
        this.tittleTextSlideDos = tittleTextSlideDos;
        this.textSlideDos = textSlideDos;
        this.tittleTextSlideTres = tittleTextSlideTres;
        this.textSlideTres = textSlideTres;
        this.tittleTextSlideCuatro = tittleTextSlideCuatro;
        this.textSlideCuatro = textSlideCuatro;
        this.imageFavicon32 = imageFavicon32;
        this.imageFavicon64 = imageFavicon64;
    }

    public String getUrlImageBannerUno() {
        return urlImageBannerUno;
    }

    public void setUrlImageBannerUno(String urlImageBannerUno) {
        this.urlImageBannerUno = urlImageBannerUno;
    }

    public String getUrlImageBannerDos() {
        return urlImageBannerDos;
    }

    public void setUrlImageBannerDos(String urlImageBannerDos) {
        this.urlImageBannerDos = urlImageBannerDos;
    }

    public String getUrlImageBannerTres() {
        return urlImageBannerTres;
    }

    public void setUrlImageBannerTres(String urlImageBannerTres) {
        this.urlImageBannerTres = urlImageBannerTres;
    }

    public String getUrlImageBannerCuatro() {
        return urlImageBannerCuatro;
    }

    public void setUrlImageBannerCuatro(String urlImageBannerCuatro) {
        this.urlImageBannerCuatro = urlImageBannerCuatro;
    }

    public String getTittleTextSlideUno() {
        return tittleTextSlideUno;
    }

    public void setTittleTextSlideUno(String tittleTextSlideUno) {
        this.tittleTextSlideUno = tittleTextSlideUno;
    }

    public String getTextSlideUno() {
        return textSlideUno;
    }

    public void setTextSlideUno(String textSlideUno) {
        this.textSlideUno = textSlideUno;
    }

    public String getTittleTextSlideDos() {
        return tittleTextSlideDos;
    }

    public void setTittleTextSlideDos(String tittleTextSlideDos) {
        this.tittleTextSlideDos = tittleTextSlideDos;
    }

    public String getTextSlideDos() {
        return textSlideDos;
    }

    public void setTextSlideDos(String textSlideDos) {
        this.textSlideDos = textSlideDos;
    }

    public String getTittleTextSlideTres() {
        return tittleTextSlideTres;
    }

    public void setTittleTextSlideTres(String tittleTextSlideTres) {
        this.tittleTextSlideTres = tittleTextSlideTres;
    }

    public String getTextSlideTres() {
        return textSlideTres;
    }

    public void setTextSlideTres(String textSlideTres) {
        this.textSlideTres = textSlideTres;
    }

    public String getTittleTextSlideCuatro() {
        return tittleTextSlideCuatro;
    }

    public void setTittleTextSlideCuatro(String tittleTextSlideCuatro) {
        this.tittleTextSlideCuatro = tittleTextSlideCuatro;
    }

    public String getTextSlideCuatro() {
        return textSlideCuatro;
    }

    public void setTextSlideCuatro(String textSlideCuatro) {
        this.textSlideCuatro = textSlideCuatro;
    }

    public String getImageFavicon32() {
        return imageFavicon32;
    }

    public void setImageFavicon32(String imageFavicon32) {
        this.imageFavicon32 = imageFavicon32;
    }

    public String getImageFavicon64() {
        return imageFavicon64;
    }

    public void setImageFavicon64(String imageFavicon64) {
        this.imageFavicon64 = imageFavicon64;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((imageFavicon32 == null) ? 0 : imageFavicon32.hashCode());
        result = prime * result + ((imageFavicon64 == null) ? 0 : imageFavicon64.hashCode());
        result = prime * result + ((textSlideCuatro == null) ? 0 : textSlideCuatro.hashCode());
        result = prime * result + ((textSlideDos == null) ? 0 : textSlideDos.hashCode());
        result = prime * result + ((textSlideTres == null) ? 0 : textSlideTres.hashCode());
        result = prime * result + ((textSlideUno == null) ? 0 : textSlideUno.hashCode());
        result = prime * result + ((tittleTextSlideCuatro == null) ? 0 : tittleTextSlideCuatro.hashCode());
        result = prime * result + ((tittleTextSlideDos == null) ? 0 : tittleTextSlideDos.hashCode());
        result = prime * result + ((tittleTextSlideTres == null) ? 0 : tittleTextSlideTres.hashCode());
        result = prime * result + ((tittleTextSlideUno == null) ? 0 : tittleTextSlideUno.hashCode());
        result = prime * result + ((urlImageBannerCuatro == null) ? 0 : urlImageBannerCuatro.hashCode());
        result = prime * result + ((urlImageBannerDos == null) ? 0 : urlImageBannerDos.hashCode());
        result = prime * result + ((urlImageBannerTres == null) ? 0 : urlImageBannerTres.hashCode());
        result = prime * result + ((urlImageBannerUno == null) ? 0 : urlImageBannerUno.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        PortalModel other = (PortalModel) obj;
        if (imageFavicon32 == null) {
            if (other.imageFavicon32 != null)
                return false;
        } else if (!imageFavicon32.equals(other.imageFavicon32))
            return false;
        if (imageFavicon64 == null) {
            if (other.imageFavicon64 != null)
                return false;
        } else if (!imageFavicon64.equals(other.imageFavicon64))
            return false;
        if (textSlideCuatro == null) {
            if (other.textSlideCuatro != null)
                return false;
        } else if (!textSlideCuatro.equals(other.textSlideCuatro))
            return false;
        if (textSlideDos == null) {
            if (other.textSlideDos != null)
                return false;
        } else if (!textSlideDos.equals(other.textSlideDos))
            return false;
        if (textSlideTres == null) {
            if (other.textSlideTres != null)
                return false;
        } else if (!textSlideTres.equals(other.textSlideTres))
            return false;
        if (textSlideUno == null) {
            if (other.textSlideUno != null)
                return false;
        } else if (!textSlideUno.equals(other.textSlideUno))
            return false;
        if (tittleTextSlideCuatro == null) {
            if (other.tittleTextSlideCuatro != null)
                return false;
        } else if (!tittleTextSlideCuatro.equals(other.tittleTextSlideCuatro))
            return false;
        if (tittleTextSlideDos == null) {
            if (other.tittleTextSlideDos != null)
                return false;
        } else if (!tittleTextSlideDos.equals(other.tittleTextSlideDos))
            return false;
        if (tittleTextSlideTres == null) {
            if (other.tittleTextSlideTres != null)
                return false;
        } else if (!tittleTextSlideTres.equals(other.tittleTextSlideTres))
            return false;
        if (tittleTextSlideUno == null) {
            if (other.tittleTextSlideUno != null)
                return false;
        } else if (!tittleTextSlideUno.equals(other.tittleTextSlideUno))
            return false;
        if (urlImageBannerCuatro == null) {
            if (other.urlImageBannerCuatro != null)
                return false;
        } else if (!urlImageBannerCuatro.equals(other.urlImageBannerCuatro))
            return false;
        if (urlImageBannerDos == null) {
            if (other.urlImageBannerDos != null)
                return false;
        } else if (!urlImageBannerDos.equals(other.urlImageBannerDos))
            return false;
        if (urlImageBannerTres == null) {
            if (other.urlImageBannerTres != null)
                return false;
        } else if (!urlImageBannerTres.equals(other.urlImageBannerTres))
            return false;
        if (urlImageBannerUno == null) {
            if (other.urlImageBannerUno != null)
                return false;
        } else if (!urlImageBannerUno.equals(other.urlImageBannerUno))
            return false;
        return true;
    }

    @Override
    public String toString() {
        return "PortalModel [imageFavicon32=" + imageFavicon32 + ", imageFavicon64=" + imageFavicon64
                + ", textSlideCuatro=" + textSlideCuatro + ", textSlideDos=" + textSlideDos + ", textSlideTres="
                + textSlideTres + ", textSlideUno=" + textSlideUno + ", tittleTextSlideCuatro=" + tittleTextSlideCuatro
                + ", tittleTextSlideDos=" + tittleTextSlideDos + ", tittleTextSlideTres=" + tittleTextSlideTres
                + ", tittleTextSlideUno=" + tittleTextSlideUno + ", urlImageBannerCuatro=" + urlImageBannerCuatro
                + ", urlImageBannerDos=" + urlImageBannerDos + ", urlImageBannerTres=" + urlImageBannerTres
                + ", urlImageBannerUno=" + urlImageBannerUno + "]";
    }
    
    
    
}
