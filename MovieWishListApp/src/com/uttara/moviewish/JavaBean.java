package com.uttara.moviewish;

public class JavaBean {
	private String movieName;
	private String directorName;
	private String producerName;
	private int ratings;
	private String review;
	
	
	public void setMovieName(String s)
	{
		if(s!= null)
			movieName=s;
		
	}
	public String getMovieName()
	{
		return movieName;
	}
	public void setDirectorName(String s2)
	{
		if(s2!= null)
			directorName=s2;
		
	}
	public String getDirectorName()
	{
		return directorName;
	}
	public void setProducerName(String s1)
	{
		if(s1!= null)
			producerName=s1;
		
	}
	public String getProducerName()
	{
		return producerName;
	}
	public void setreview(String s3)
	{
		if(s3!= null)
			review=s3;
		
	}
	public String getReview()
	{
		return review;
	}
	public void setRate(int s)
	{
		if(s>0 && s<=100)
			ratings =s;
		
	}
	public int getRate()
	{
		return ratings;
	}
	public JavaBean()
	{
		
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((directorName == null) ? 0 : directorName.hashCode());
		result = prime * result + ((movieName == null) ? 0 : movieName.hashCode());
		result = prime * result + ((producerName == null) ? 0 : producerName.hashCode());
		result = prime * result + ratings;
		result = prime * result + ((review == null) ? 0 : review.hashCode());
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
		JavaBean other = (JavaBean) obj;
		if (directorName == null) {
			if (other.directorName != null)
				return false;
		} else if (!directorName.equals(other.directorName))
			return false;
		if (movieName == null) {
			if (other.movieName != null)
				return false;
		} else if (!movieName.equals(other.movieName))
			return false;
		if (producerName == null) {
			if (other.producerName != null)
				return false;
		} else if (!producerName.equals(other.producerName))
			return false;
		if (ratings != other.ratings)
			return false;
		if (review == null) {
			if (other.review != null)
				return false;
		} else if (!review.equals(other.review))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "JavaBean [movieName=" + movieName + ", directorName=" + directorName + ", producerName=" + producerName
				+ ", ratings=" + ratings + ", review=" + review + "]";
	}
	public JavaBean(String movieName, String directorName, String producerName, int ratings, String review) {
		super();
		this.movieName = movieName;
		this.directorName = directorName;
		this.producerName = producerName;
		this.ratings = ratings;
		this.review = review;
	}
	
}
