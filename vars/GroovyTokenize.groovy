class GroovyTokenize {
 
    static main(args) {
        def text = 'Hello World'
        println text.tokenize() // [Hello, World]
         
        def textWithComma = 'Hello,World'
        println textWithComma.tokenize(',') // [Hello, World]
         
        def textWithTab = 'Hello    World'
        println textWithTab.tokenize()
    }
 
}

