 
listView('asda2da3 Jobs') {
    description('asda2da3 Jobs')
    jobs {
        regex('asda2da3_.+')
    }
    columns {
        status()
        weather()
        name()
        lastSuccess()
        lastFailure()
        lastDuration()
        buildButton()
    }
}
