class Container[+T](item: T) {
  def put[U >: T](a: U): Container[U] = new Container(a)
  def get(): T = item
}
