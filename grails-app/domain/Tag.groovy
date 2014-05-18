class Tag
{
	String name

	static hasMany = [tasks: Task]

	static constraints = 
	{
		name blank: false, unique: true
	}
}
