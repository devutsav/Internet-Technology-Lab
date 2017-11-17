use warnings;
my %hobby = (
    'ashu' => 'plays cricket',
    'babu' => 'plays football',
    'lal' => 'plays tennis',
);
$hobby{'john'}='plays table tennis';
delete $hobby{'lal'};
print "Hobby of babu"," = ", $hobby{'babu'},"\n";
#print "Hobby of lal"," = ", $hobby{'lal'};
print "Hobby of john"," = ", $hobby{'john'},"\n";
